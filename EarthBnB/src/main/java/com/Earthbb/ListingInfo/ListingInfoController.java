package com.Earthbb.ListingInfo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/v1/listings/")
public class ListingInfoController {
    @Autowired
    private ListingInfoRepository listingInfoRepository;

    @GetMapping
    public List<ListingInfo> list() { return listingInfoRepository.findAll();}

    @GetMapping("{id}")
    public ListingInfo getByID(@PathVariable("id") long id) { return listingInfoRepository.getOne(id);}

    // @PostMapping
    // @ResponseStatus(HttpStatus.OK)
    // public void create(@RequestBody ListingInfo listingInfo) { listingInfoRepository.save(listingInfo);}

    // @DeleteMapping("/{id}")
    // public void delete(@PathVariable Long id) { listingInfoRepository.deleteById(id);}
}
