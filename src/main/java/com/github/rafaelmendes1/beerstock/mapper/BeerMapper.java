package com.github.rafaelmendes1.beerstock.mapper;

import com.github.rafaelmendes1.beerstock.dto.BeerDTO;
import com.github.rafaelmendes1.beerstock.entities.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
