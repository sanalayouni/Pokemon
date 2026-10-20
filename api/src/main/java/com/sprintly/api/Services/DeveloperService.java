package com.sprintly.api.Services;

import com.sprintly.api.Models.Developer;
import com.sprintly.api.Repositories.DeveloperRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperService {

    private final DeveloperRepository developerRepository;

    public DeveloperService(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    public List<Developer> getAllDeveloper() {
        return developerRepository.findAll();
    }


    public Developer createDeveloper(Developer developer){
        return developerRepository.save(developer);
    }

    public Developer getDeveloperById(int id) {
        return developerRepository.findById(id).orElse(null);
    }

    public Developer updateDeveloper(int id, Developer newDeveloper) {
        Developer developer = developerRepository.findById(id).orElse(null);

        if (developer != null) {
            developer.setName(newDeveloper.getName());
            developer.setEmail(newDeveloper.getEmail());

            return developerRepository.save(developer);
        }

        return null;
    }

    public void deleteDeveloper(int id) {
        developerRepository.deleteById(id);
    }




}