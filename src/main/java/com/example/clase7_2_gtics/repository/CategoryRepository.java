package com.example.clase7_2_gtics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.clase7_2_gtics.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}

