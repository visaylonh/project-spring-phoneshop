package org.spring.boot.projectspringphoneshop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.spring.boot.projectspringphoneshop.dto.BrandDTO;
import org.spring.boot.projectspringphoneshop.entity.Brand;

@Mapper
public interface BrandMapper {

    BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);
    Brand toBrand(BrandDTO dto);

    BrandDTO toBrandDTO(Brand entity);
}
