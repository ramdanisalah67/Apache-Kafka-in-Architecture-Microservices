package com.example.demo.Repositories;

import com.example.demo.Models.WikiMedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikiRepository extends JpaRepository<WikiMedia,Long> {
}
