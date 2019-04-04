package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistilleryRepository extends JpaRepository<Distillery, Long>, DistilleryRepositoryCustom {

    List<Distillery> findDistilleryByName(String name);

    List<Distillery> findDistilleryByRegion(String name);

    List<Distillery> findAllWhiskysByName(String name);


}
