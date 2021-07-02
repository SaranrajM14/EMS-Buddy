package com.tvm.policicue.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvm.policicue.model.PersonalInformation;
import com.tvm.policicue.repository.PersonalInformationRepository;

@Service
public class PersonalInformationImpl implements PersonalInformationService {
	@Autowired private PersonalInformationRepository personalInformationRepository;
	@Override
	public void savePersonalInformation(PersonalInformation personalInformation) {
		personalInformationRepository.save(personalInformation);
	}

	@Override
	public PersonalInformation getById(long id) {
		Optional<PersonalInformation> optional=personalInformationRepository.findById(id);
		PersonalInformation personalInformation=null;
		if(optional.isPresent()) {
			personalInformation=optional.get();
			return personalInformation;
		}
		return null;
	}

}
