package com.df.registerAnEvent.EventRegisterRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.df.registerAnEvent.model.EventRegister;

@Repository

public interface EventRegisterRepository extends MongoRepository<EventRegister , String>
{	
//	EventRegister findByeventTitle(String EventTitle);
//
//	EventRegister findByEventTitle(String eventitle);

	EventRegister findByPublished(String published);


}
