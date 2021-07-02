package com.tvm.policicue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvm.policicue.model.PersonalInformation;

@Repository
public interface PersonalInformationRepository extends JpaRepository<PersonalInformation,Long> {

}
