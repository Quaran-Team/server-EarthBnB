package com.Earthbb.TTK;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/ttk/")
public class TtkController {

    @Autowired
    private TtkRepository ttkRepository;

    @GetMapping
    public List<Ttk> list() { return ttkRepository.findAll();}

    @GetMapping("{id}")
    public Ttk get(@PathVariable("id") long id) { return ttkRepository.getOne(id);}

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Ttk ttk) { ttkRepository.save(ttk);}

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) { ttkRepository.deleteById(id);}
}

