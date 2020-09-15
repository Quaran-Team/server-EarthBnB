package com.Earthbb.Reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reservations/")
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping
    public List<Reservation> list() { return reservationRepository.findAll();}

    @GetMapping("{id}")
    public Reservation get(@PathVariable("id") long id) { return reservationRepository.getOne(id);}

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Reservation reservationData) { reservationRepository.save(reservationData);}

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) { reservationRepository.deleteById(id);}
}
