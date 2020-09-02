package com.Earthbb.MPTS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
}
