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

	@Override
	public Train updateTrain(Train train) {
		
		Train databaseTrain = new Train();
		
		try {
			databaseTrain = repository.findById(train.getTuid()).get();
		} catch (Exception e) {
			return null;
		}
		
		if(train.getTrainName()!= null && !train.getTrainName().isEmpty()){
			databaseTrain.setTrainName(train.getTrainName());
		}
		if(train.getStartStation()!= null && !train.getStartStation().isEmpty()){
			databaseTrain.setStartStation(train.getStartStation());
		}
		if(train.getEndStation()!= null && !train.getEndStation().isEmpty()){
			databaseTrain.setEndStation(train.getEndStation());
		}
		if(train.getDepartureDate()!= null && !train.getDepartureDate().isEmpty()){
			databaseTrain.setDepartureDate(train.getDepartureDate());
		}
		if(train.getArrivalDate()!= null && !train.getArrivalDate().isEmpty()){
			databaseTrain.setArrivalDate(train.getArrivalDate());
		}
		if(train.getDepartureTime()!= null && !train.getDepartureTime().isEmpty()){
			databaseTrain.setDepartureTime(train.getDepartureTime());
		}
		if(train.getArrivalTime()!= null && !train.getArrivalTime().isEmpty()){
			databaseTrain.setArrivalTime (train.getArrivalTime());
		}
		if(train.getStatus()!= null && !train.getStatus().isEmpty()){
			databaseTrain.setStatus(train.getStatus());
		}
		
		Train updatedTrain =  repository.save(databaseTrain);
		
		return updatedTrain;
	}

}
