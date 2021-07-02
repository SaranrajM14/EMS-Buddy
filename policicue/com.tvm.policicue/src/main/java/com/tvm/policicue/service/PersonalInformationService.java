package com.tvm.policicue.service;

import com.tvm.policicue.model.PersonalInformation;

public interface PersonalInformationService {
	public void savePersonalInformation(PersonalInformation personalInformation);
	public PersonalInformation getById(long id);
	
}
