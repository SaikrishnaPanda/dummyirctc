package com.dummyirctc.trainschedule.serviceimp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dummyirctc.trainschedule.TrainscheduleApplication;
import com.dummyirctc.trainschedule.controller.TrainController;
import com.dummyirctc.trainschedule.dto.CreateTraindto;
import com.dummyirctc.trainschedule.entity.Train;
import com.dummyirctc.trainschedule.repository.TrainRepository;
import com.dummyirctc.trainschedule.service.TrainService;

@Service
public class TrainServiceimp implements TrainService {

    private final TrainscheduleApplication trainscheduleApplication;

    private final TrainController trainController;
	
	@Autowired
	private TrainRepository repository;

    TrainServiceimp(TrainController trainController, TrainscheduleApplication trainscheduleApplication) {
        this.trainController = trainController;
        this.trainscheduleApplication = trainscheduleApplication;
    }

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

	@Override
	public Train updateTrain(Train train) {
		
		Train databaseTrain = new Train();
		
		try {
			databaseTrain = repository.findById(train.getTuid()).get();
		} catch (Exception e) {
			return null;
		}
		
		if(train.getTrainName()!= null || train.getTrainName()!= ""){
			databaseTrain.setTrainName(train.getTrainName());
		}
		if(train.getStartStation()!= null || train.getStartStation()!= ""){
			databaseTrain.setStartStation(train.getStartStation());
		}
		if(train.getEndStation()!= null || train.getEndStation()!= ""){
			databaseTrain.setEndStation(train.getEndStation());
		}
		if(train.getDepartureDate()!= null || train.getDepartureDate()!= ""){
			databaseTrain.setDepartureDate(train.getDepartureDate());
		}
		if(train.getArrivalDate()!= null || train.getArrivalDate()!= ""){
			databaseTrain.setArrivalDate(train.getArrivalDate());
		}
		if(train.getDepartureTime()!= null || train.getDepartureTime()!= ""){
			databaseTrain.setDepartureDate(train.getDepartureDate());
		}
		if(train.getArrivalDate()!= null || train.getArrivalDate()!= ""){
			databaseTrain.setArrivalDate (train.getArrivalDate());
		}
		if(train.getStatus()!= null || train.getStatus()!= ""){
			databaseTrain.setStatus(train.getStatus());
		}
		
		Train updatedTrain =  repository.save(databaseTrain);
		
		return updatedTrain;
	}

}
