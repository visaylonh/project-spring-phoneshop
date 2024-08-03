package org.spring.boot.projectspringphoneshop.service.util;

import org.spring.boot.projectspringphoneshop.dto.BrandDTO;
import org.spring.boot.projectspringphoneshop.entity.Brand;

public class Mapper {

    public static Brand toBrand(BrandDTO dto){

        Brand brand = new Brand();
        //brand.setId(dto.getId());
        brand.setName(dto.getName());

        return brand;
    }

    public static BrandDTO toBrandDTO(Brand brand){

        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setName(brand.getName());

        return brandDTO;
    }


}
