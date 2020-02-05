package com.acn.powerrangers.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acn.powerrangers.PowerrangersApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PowerrangersApplication.class })
public class PowerrangerServiceTest {
	@Autowired
	PowerrangerService powerrangerService;
	
	@Test
	public void testReadPowerrangers() {
		boolean hasNext = powerrangerService.readPowerrangers().iterator().hasNext();
	Assert.assertFalse(hasNext);
	}

}
