package com.joaodarwin.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaodarwin.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
