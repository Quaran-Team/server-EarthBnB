package com.Earthbb.HostData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/v1/hostdata/")
public class HostDataController {

    @Autowired 
    private HostDataRepository hostRepository;

    @GetMapping
    public List<HostData> list() { return hostRepository.findAll();}

    @GetMapping("{id}")
    public HostData get(@PathVariable("id") long id) { return hostRepository.getOne(id);}

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody HostData hostData) { hostRepository.save(hostData);}

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) { hostRepository.deleteById(id);}
}
