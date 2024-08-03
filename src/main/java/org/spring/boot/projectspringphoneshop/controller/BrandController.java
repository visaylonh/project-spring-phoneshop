package org.spring.boot.projectspringphoneshop.controller;

import org.spring.boot.projectspringphoneshop.dto.BrandDTO;
import org.spring.boot.projectspringphoneshop.entity.Brand;
import org.spring.boot.projectspringphoneshop.service.BrandService;
import org.spring.boot.projectspringphoneshop.service.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("brands")

public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO){

        Brand brand = Mapper.toBrand(brandDTO);
        brand = brandService.create(brand);

        return ResponseEntity.ok(Mapper.toBrandDTO(brand));
    }
}
