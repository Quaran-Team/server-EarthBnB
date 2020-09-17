package com.Earthbb.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/v1/map")
public class MapController {

    @Autowired
    private MapRepository mapRepository;

    @GetMapping
    public List<Map> list() { return mapRepository.findAll();}

    @GetMapping("{id}")
    public Map get(@PathVariable("id") long id) { return mapRepository.getOne(id);}

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Map map) { mapRepository.save(map);}

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) { mapRepository.deleteById(id);}

    @PutMapping("/{id}")
    public ResponseEntity<Map> update(@PathVariable(value = "id") Long id,
                                       @RequestBody Map mapDetails) throws ResourceNotFoundException {
        Map map = mapRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Sorry, we don't have that as your next get away!"));
        map.setStreet(mapDetails.getStreet());
        map.setCity(mapDetails.getCity());
        map.setState_territory(mapDetails.getState_territory());
        map.setCountry(mapDetails.getCountry());
        map.setZip(mapDetails.getZip());
        map.setInternational(mapDetails.getInternational());
        map.setLat(mapDetails.getLat());
        map.setLon(mapDetails.getLon());
        final Map updated = mapRepository.save(map);
        return ResponseEntity.ok(updated);
    }
}