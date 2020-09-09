package com.Earthbb.Reviews;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/reviews/")
public class ReviewsController {
    @Autowired
    private ReviewsRepository reviewsRepository;

    @GetMapping
    public List<Reviews> list() { return reviewsRepository.findAll();}

    @GetMapping("{id}")
    public Reviews get(@PathVariable("id") long id) { return reviewsRepository.getOne(id);}

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Reviews reviews) { reviewsRepository.save(reviews);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { reviewsRepository.deleteById(id);}
}
