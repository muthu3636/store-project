package com.example.Store_Project.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Store_Project.models.Product;

public interface ProductRepo extends JpaRepository<Product,Long>{

}
