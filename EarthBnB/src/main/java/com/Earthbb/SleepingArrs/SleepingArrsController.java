package com.Earthbb.SleepingArrs;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/v1/sleepingarrs")
public class SleepingArrsController {
    @Autowired
    private SleepingArrsRepository sleepingArrsRepository;

    @GetMapping("/")
    public List<SleepingArrs> getAllItems() { return sleepingArrsRepository.findAll();}

    @GetMapping("/{id}")
    public SleepingArrs getByID(@PathVariable("id") long id) { return sleepingArrsRepository.getOne(id);}

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody SleepingArrs sleepingArrs) { sleepingArrsRepository.save(sleepingArrs);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { sleepingArrsRepository.deleteById(id);}
}

