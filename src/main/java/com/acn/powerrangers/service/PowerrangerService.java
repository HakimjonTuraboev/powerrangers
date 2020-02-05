package com.acn.powerrangers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.acn.powerrangers.model.Powerranger;
import com.acn.powerrangers.persistence.PowerrangerRepository;

@Service
//@Component
public class PowerrangerService {
	@Autowired
	PowerrangerRepository powerrangerRepository;

	public Iterable<Powerranger> readPowerrangers() {
		return powerrangerRepository.findAll();
	}

	public Powerranger readPowerrangerById(Long id) {
		return powerrangerRepository.findById(id).orElse(null);

	}

	public void createPowerranger(Powerranger powerranger) {
		powerrangerRepository.save(powerranger);
	}
}
