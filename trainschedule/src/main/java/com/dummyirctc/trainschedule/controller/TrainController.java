package com.dummyirctc.trainschedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dummyirctc.trainschedule.dto.CreateTraindto;
import com.dummyirctc.trainschedule.entity.Train;
import com.dummyirctc.trainschedule.service.TrainService;

@RestController
@RequestMapping("/api/train")
public class TrainController {

	@Autowired
	private TrainService service;
	
	@PostMapping("/createtrain")
	public ResponseEntity<?> createTrain(@RequestBody CreateTraindto dto){
		Train createTrainResponse = service.createTrain(dto);
		return ResponseEntity.status(HttpStatus.OK).body(createTrainResponse);
	}
	
	
}
