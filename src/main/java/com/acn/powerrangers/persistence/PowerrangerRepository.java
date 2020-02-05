package com.acn.powerrangers.persistence;

import org.springframework.data.repository.CrudRepository;

import com.acn.powerrangers.model.Powerranger;

public interface PowerrangerRepository extends CrudRepository<Powerranger, Long> {

}
