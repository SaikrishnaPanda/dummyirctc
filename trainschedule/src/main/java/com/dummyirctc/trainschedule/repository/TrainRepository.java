package com.dummyirctc.trainschedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dummyirctc.trainschedule.entity.Train;

public interface TrainRepository extends JpaRepository<Train, Long> {

}
