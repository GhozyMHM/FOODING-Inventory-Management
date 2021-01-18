package com.springcrud.FoodMaterial.service;

import com.springcrud.FoodMaterial.domain.bahan_makanan;
import com.springcrud.FoodMaterial.repository.FoodingRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ghozy
 */

@Service
public class FoodingService {
    @Autowired
    private FoodingRepository repo;
 
    public List<bahan_makanan> listAll() {
        return repo.findAll();
    }
     
    public void save(bahan_makanan std) {
        repo.save(std);
    }
     
    public bahan_makanan get(int ID_Bahan_Makanan) {
        return repo.findById(ID_Bahan_Makanan).get();
    }

    public void delete(int ID_Bahan_Makanan) {
        repo.deleteById(ID_Bahan_Makanan);
    }
}
