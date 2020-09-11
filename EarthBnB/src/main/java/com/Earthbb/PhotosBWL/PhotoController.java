package com.Earthbb.PhotosBWL;

import com.Earthbb.MPTS.Mpts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/v1/photos")
public class PhotoController {

    @Autowired
    private PhotoRepository photoRepository;

    @GetMapping
    public List<PhotoData> list() {return photoRepository.findAll();}

    @GetMapping("/{id}")
    public PhotoData get(@PathVariable("id") long id){return photoRepository.getOne(id);}

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody PhotoData photoData) { photoRepository.save(photoData);}

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) { photoRepository.deleteById(id);}


    @PutMapping("/{id}")
    public ResponseEntity<PhotoData> update(@PathVariable(value="id") Long id,
                                            @RequestBody PhotoData photoDetails) throws ResourceNotFoundException {
        PhotoData photoData = photoRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Sorry, something went wrong with the camera!"));

        photoData.setSauce(photoDetails.getSauce());

        photoData.setPic1url(photoDetails.getPic1url());
        photoData.setPic1alt(photoDetails.getPic1alt());

        photoData.setPic2url(photoDetails.getPic2url());
        photoData.setPic2alt(photoDetails.getPic2alt());

        photoData.setPic3url(photoDetails.getPic3url());
        photoData.setPic3alt(photoDetails.getPic3alt());

        photoData.setPic4url(photoDetails.getPic4url());
        photoData.setPic4alt(photoDetails.getPic4alt());

        photoData.setPic5url(photoDetails.getPic5url());
        photoData.setPic5alt(photoDetails.getPic5alt());

        photoData.setPic6url(photoDetails.getPic6url());
        photoData.setPic6alt(photoDetails.getPic6alt());

        photoData.setPic7url(photoDetails.getPic7url());
        photoData.setPic7alt(photoDetails.getPic7alt());

        photoData.setPic8url(photoDetails.getPic8url());
        photoData.setPic8alt(photoDetails.getPic8alt());

        final PhotoData updated = photoRepository.save(photoData);
        return ResponseEntity.ok(updated);
    }

}
