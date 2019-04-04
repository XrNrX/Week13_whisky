package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {

    List<Whisky> findWhiskyByName(String whiskyName);

    List<Whisky> findWhiskyByDistilleryId(Long distilleryId);

    List<Whisky> findWhiskyByYear(int year);

    List<Whisky> findWhiskyByAge(int year);
}
