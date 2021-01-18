package com.springcrud.FoodMaterial.repository;

import com.springcrud.FoodMaterial.domain.bahan_minuman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ghozy
 */

@Repository
public interface MinumanRepository extends JpaRepository<bahan_minuman, Integer>{
}
