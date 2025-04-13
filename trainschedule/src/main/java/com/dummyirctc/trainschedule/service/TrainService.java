package com.dummyirctc.trainschedule.service;

import com.dummyirctc.trainschedule.dto.CreateTraindto;
import com.dummyirctc.trainschedule.entity.Train;

public interface TrainService {
	
	Train createTrain(CreateTraindto dto);
	
	
}
