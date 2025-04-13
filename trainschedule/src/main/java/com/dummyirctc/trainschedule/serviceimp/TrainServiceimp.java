package com.dummyirctc.trainschedule.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dummyirctc.trainschedule.dto.CreateTraindto;
import com.dummyirctc.trainschedule.entity.Train;
import com.dummyirctc.trainschedule.repository.TrainRepository;
import com.dummyirctc.trainschedule.service.TrainService;

@Service
public class TrainServiceimp implements TrainService {
	
	@Autowired
	private TrainRepository repository;

	@Override
	public Train createTrain(CreateTraindto dto) {
		Train train = new Train();
		train.setTrainName(dto.getTrainName());
		train.setStartStation(dto.getStartStation());
		train.setEndStation(dto.getEndStation());
		train.setDepartureDate(dto.getDepartureDate());
		train.setArrivalDate(dto.getArrivalDate());
		train.setDepartureTime(dto.getDepartureTime());
		train.setArrivalTime(dto.getArrivalTime());
		train.setStatus(dto.getStatus());
		
		Train savedTrainn =  repository.save(train);
		
		return savedTrainn;
	}

}
