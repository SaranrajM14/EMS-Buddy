package com.tvm.policicue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tvm.policicue.model.PersonalInformation;
import com.tvm.policicue.service.PersonalInformationService;

@RestController
public  class PersonalInformationController {
	@Autowired
	private PersonalInformationService personalInformationService;
	@PostMapping("/personalInformationSystem")
	public PersonalInformation personalInformationSyste(@RequestBody PersonalInformation personalInformation) 
		{
			this.personalInformationService.savePersonalInformation(personalInformation);
			return personalInformation;
		}
	@PostMapping("/PersonalInformationById")
	public PersonalInformation personalInformationById(@RequestBody long id) {
		PersonalInformation personalInformation=this.personalInformationService.getById(id);
		return personalInformation;
	}
	
	

}
