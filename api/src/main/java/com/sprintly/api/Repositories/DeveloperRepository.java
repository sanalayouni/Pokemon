package com.sprintly.api.Repositories;

import com.sprintly.api.Models.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer, Integer> {

}

