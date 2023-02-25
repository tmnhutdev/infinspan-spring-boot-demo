package vn.ifa.study.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import vn.ifa.study.model.Owner;
import vn.ifa.study.repository.OwnerRepository;

@Slf4j
@RestController
@RequestMapping(value = "/api/owners")
public class OwnerController {
    
    private OwnerRepository ownerRepository;
    
    public OwnerController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }
    
    @PostMapping
    public ResponseEntity<String> create(@RequestBody Owner owner) {
        try {
            String id = UUID.randomUUID().toString();
            owner.setId(id);
            this.ownerRepository.save(owner);
            log.info("Created new owner and save into cache: {}", id);
            return ResponseEntity.ok(owner.getId());
        }
        catch(Exception e) {
            log.error("Occured error while creating new owner", e);
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @GetMapping
    public ResponseEntity<List<Owner>> getAll() {
        log.info("Get all of owners from cache");
        return ResponseEntity.ok(this.ownerRepository.findAll());
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Owner> getById(@PathVariable String id) {

        log.info("Get owner from cache by id: {}", id);
        return ResponseEntity.ok(this.ownerRepository.findById(id));
    }

}
