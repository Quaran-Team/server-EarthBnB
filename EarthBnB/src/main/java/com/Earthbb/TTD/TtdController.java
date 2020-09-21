package com.Earthbb.TTD;

import com.Earthbb.MPTS.Mpts;
import com.Earthbb.MPTS.MptsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/v1/ttd")
public class TtdController {
    @Autowired
    private TtdRepository ttdRepository;

    @GetMapping
    public List<Ttd> list() { return ttdRepository.findAll();}

    @GetMapping("/{id}")
    public Ttd get(@PathVariable("id") long id) { return ttdRepository.getOne(id);}

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Ttd ttd) { ttdRepository.save(ttd);}

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) { ttdRepository.deleteById(id);}
}
