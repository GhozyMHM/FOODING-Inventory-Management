package com.springcrud.FoodMaterial.service;

import com.springcrud.FoodMaterial.domain.bahan_minuman;
import com.springcrud.FoodMaterial.repository.MinumanRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MinumanService {
    @Autowired
    private MinumanRepository repo;

    public List<bahan_minuman> listAll() {
        return repo.findAll();
    }

    public void save(bahan_minuman std) {
        repo.save(std);
    }

    public bahan_minuman get(int ID_Bahan_Minuman) {
        return repo.findById(ID_Bahan_Minuman).get();
    }

    public void delete(int ID_Bahan_Minuman) {
        repo.deleteById(ID_Bahan_Minuman);
    }
}
