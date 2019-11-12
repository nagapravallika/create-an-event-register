package com.df.registerAnEvent.EventRegisterController;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.df.registerAnEvent.EventRegisterRepository.EventRegisterRepository;
import com.df.registerAnEvent.model.EventRegister;




@RestController
@RequestMapping("/api/eventRegister")
public class EventRegisterController 
{
		
		@Autowired
		private EventRegisterRepository repository;
		

		
		@PostMapping("/create")
		public String saveEventRegister(@RequestBody EventRegister eventRegister) {
			repository.save(eventRegister);
			return "User Saved Sucessfully........";
			
		}
		@GetMapping("getUser/{published}")
		public EventRegister getUserbyPublished(@PathVariable String   published){
			return repository.findByPublished(published);
		}
		@GetMapping("/find")
		public List<EventRegister> getAllEventRegister(){
			return repository.findAll();
		}

}
