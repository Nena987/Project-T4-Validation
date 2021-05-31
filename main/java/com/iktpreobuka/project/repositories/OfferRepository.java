package com.iktpreobuka.project.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.project.entities.OfferEntity;

public interface OfferRepository extends CrudRepository<OfferEntity, Integer> {

	public List<OfferEntity> findByActionPriceBetween(Double lowerPrice, Double upperPrice);
	

}
