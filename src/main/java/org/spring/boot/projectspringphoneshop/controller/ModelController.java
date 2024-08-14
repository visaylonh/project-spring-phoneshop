package org.spring.boot.projectspringphoneshop.controller;

import lombok.RequiredArgsConstructor;
import org.spring.boot.projectspringphoneshop.dto.ModelDTO;
import org.spring.boot.projectspringphoneshop.entity.Model;
import org.spring.boot.projectspringphoneshop.mapper.ModelMapper;
import org.spring.boot.projectspringphoneshop.service.ModelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("/models")

public class ModelController {

    private final ModelService modelService;
    private final ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ModelDTO modelDTO){


        Model model = modelMapper.toModel(modelDTO);
        model = modelService.save(model);


        return ResponseEntity.ok(modelMapper.toModelDTO(model));
    }
}
