package com.springcrud.FoodMaterial.service;

import com.springcrud.FoodMaterial.domain.bahan_minuman;
import com.springcrud.FoodMaterial.domain.supplier;
import com.springcrud.FoodMaterial.repository.MinumanRepository;
import com.springcrud.FoodMaterial.repository.SupplierRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository repo;

    public List<supplier> listAll() {
        return repo.findAll();
    }

    public void save(supplier std) {
        repo.save(std);
    }

    public supplier get(int ID_Supplier) {
        return repo.findById(ID_Supplier).get();
    }

    public void delete(int ID_Supplier) {
        repo.deleteById(ID_Supplier);
    }
}
