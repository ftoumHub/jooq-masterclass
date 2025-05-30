package com.jooqmasterclass.controller;

import java.util.List;

import com.jooqmasterclass.pojo.Office;
import com.jooqmasterclass.service.ClassicModelsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassicModelsController {

    private final ClassicModelsService classicModelsService;

    public ClassicModelsController(ClassicModelsService classicModelsService) {
        this.classicModelsService = classicModelsService;
    }

    @GetMapping("/officesInTerritory")
    public List<Office> fetchOfficesInTerritory(@RequestParam(name = "territory") String territory) {

        return classicModelsService.fetchOfficesInTerritory(territory);
    }
}
