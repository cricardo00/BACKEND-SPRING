package com.seguro.seguro.services;

import com.seguro.seguro.model.BienesEntity;
import com.seguro.seguro.repository.BienesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BienesService {

    @Autowired
    private BienesRepository bienesRepository;

    public List<BienesEntity> getAllBienes() {
        return bienesRepository.findAll();
    }
}
