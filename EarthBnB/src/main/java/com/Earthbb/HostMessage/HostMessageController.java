package com.Earthbb.HostMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200"})
@RestController
@RequestMapping("/api/v1/hostmessage")
public class HostMessageController {
    @Autowired
    private HostMessageRepositiory hostMessageRepositiory;

    @GetMapping
    public List<HostMessage> list(){ return hostMessageRepositiory.findAll();}

    @GetMapping("/{id}")
    public HostMessage get(@PathVariable("id") long id) { return hostMessageRepositiory.getOne(id);}

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody HostMessage hostmessage) { hostMessageRepositiory.save(hostmessage);}

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) { hostMessageRepositiory.deleteById(id);}

}