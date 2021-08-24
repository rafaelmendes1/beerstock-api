package com.github.rafaelmendes1.beerstock.repositories;

import com.github.rafaelmendes1.beerstock.entities.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Long> {
}
