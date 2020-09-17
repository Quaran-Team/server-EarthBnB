package com.Earthbb.Amenities;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/v1/amenities")
public class AmenitiesController {

    @Autowired
    private AmenitiesRepository amenitiesRepository;

    @GetMapping("/")
    public List<Amenities> getAllItems() { return amenitiesRepository.findAll();}

    @GetMapping("/{id}")
    public Amenities getByID(@PathVariable("id") long id) { return amenitiesRepository.getOne(id);}

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Amenities amenities) { amenitiesRepository.save(amenities);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { amenitiesRepository.deleteById(id);}
}
