package com.springcrud.FoodMaterial.repository;

import com.springcrud.FoodMaterial.domain.bahan_minuman;
import com.springcrud.FoodMaterial.domain.supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ghozy
 */

@Repository
public interface SupplierRepository extends JpaRepository<supplier, Integer> {

}
