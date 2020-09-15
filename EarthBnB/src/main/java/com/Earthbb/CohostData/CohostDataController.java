package com.Earthbb.CohostData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/v1/cohostdata/")
public class CohostDataController {

    @Autowired 
    private CohostDataRepository cohostRepository;

    @GetMapping
    public List<CohostData> list() { return cohostRepository.findAll();}

    @GetMapping("{id}")
    public CohostData get(@PathVariable("id") long id) { return cohostRepository.getOne(id);}

//    @PostMapping
//    @ResponseStatus(HttpStatus.OK)
//    public void create(@RequestBody CohostData cohostData) { cohostRepository.save(cohostData);}
//
//    @DeleteMapping("/{id}")
//    void delete(@PathVariable Long id) { cohostRepository.deleteById(id);}
}
