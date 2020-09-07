package com.Earthbb.MPTS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mpts")
public class MptsController {

    @Autowired
    private MptsRepository mptsRepository;

    @GetMapping
    public List<Mpts> list() { return mptsRepository.findAll();}

    @GetMapping("{id}")
    public Mpts get(@PathVariable("id") long id) { return mptsRepository.getOne(id);}

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Mpts mpts) { mptsRepository.save(mpts);}

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) { mptsRepository.deleteById(id);}

    @PutMapping("/{id}")
    public ResponseEntity<Mpts> update(@PathVariable(value = "id") Long id,
                                       @RequestBody Mpts mptsDetails) throws ResourceNotFoundException {
        Mpts mpts = mptsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Sorry, we don't have that as your next get away!"));
        mpts.setRating(mptsDetails.getRating());
        mpts.setRating_amount(mptsDetails.getRating_amount());
        mpts.setSuperhost(mptsDetails.getSuperhost());
        mpts.setPrice(mptsDetails.getPrice());
        mpts.setAddress(mptsDetails.getAddress());
        mpts.setCity(mptsDetails.getCity());
        mpts.setState_territory(mptsDetails.getState_territory());
        mpts.setCountry(mptsDetails.getCountry());
        mpts.setZip(mptsDetails.getZip());
        mpts.setInternational(mptsDetails.getInternational());
        mpts.setHost(mptsDetails.getHost());
        mpts.setTitle(mptsDetails.getTitle());
        mpts.setBeds(mptsDetails.getBeds());
        mpts.setBedrooms(mptsDetails.getBedrooms());
        mpts.setBathrooms(mptsDetails.getBathrooms());
        final Mpts updated = mptsRepository.save(mpts);
        return ResponseEntity.ok(updated);
    }

}
