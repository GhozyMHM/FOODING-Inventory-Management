package com.springcrud.FoodMaterial.repository;

import com.springcrud.FoodMaterial.domain.bahan_makanan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ghozy
 */

@Repository
public interface FoodingRepository extends JpaRepository<bahan_makanan, Integer> {
    
}
