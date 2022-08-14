package com.photo.voting.repository;

import com.photo.voting.model.Winner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WinnerRepository extends JpaRepository<Winner, Long>{
    List<Winner> findAll();
}
