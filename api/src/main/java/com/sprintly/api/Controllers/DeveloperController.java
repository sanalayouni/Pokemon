package com.sprintly.api.Controllers;

import com.sprintly.api.Models.Developer;
import com.sprintly.api.Services.DeveloperService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Developer")
public class DeveloperController {

    private final DeveloperService developerService;

    public DeveloperController(DeveloperService developerService) {
        this.developerService = developerService;
    }

    // READ ALL
    @GetMapping
    public List<Developer> getAllDeveloper() {
        return developerService.getAllDeveloper();
    }

    // CREATE
    @PostMapping
    public Developer createNewDeveloper(@RequestBody Developer developer) {
        return developerService.createDeveloper(developer);
    }

    // READ ONE
    @GetMapping("/{id}")
    public Developer getDeveloperById(@PathVariable int id) {
        return developerService.getDeveloperById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Developer updateDeveloper(
            @PathVariable int id,
            @RequestBody Developer newDeveloper) {
        return developerService.updateDeveloper(id, newDeveloper);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteDeveloper(@PathVariable int id) {
        developerService.deleteDeveloper(id);
    }
}