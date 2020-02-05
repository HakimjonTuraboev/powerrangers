package com.acn.powerrangers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acn.powerrangers.model.Powerranger;
import com.acn.powerrangers.service.PowerrangerService;

@RestController
public class PowerrangerController {
	@Autowired
	PowerrangerService powerrangerService;

	@GetMapping("/powerrangers")
	public Iterable<Powerranger> readAllPowerrangers() {
		return powerrangerService.readPowerrangers();
	}

	@PostMapping("/powerrangers")
	public void createPowerranger(@RequestBody Powerranger powerranger) {

		powerrangerService.createPowerranger(powerranger);

	}

	@GetMapping("/powerrangers/{id}")
	public Powerranger findPowerrangerById(@PathVariable("id") Long id) {

		return powerrangerService.readPowerrangerById(id);
	}

}
