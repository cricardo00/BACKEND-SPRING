package com.seguro.seguro.controller;

import com.seguro.seguro.model.BienesEntity;
import com.seguro.seguro.services.BienesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bien")


public class BienesController {

    @Autowired
    private BienesService bienesService;

    @GetMapping("/all")
    public List<BienesEntity> getAllBienes() {
        return bienesService.getAllBienes();
    }
}
