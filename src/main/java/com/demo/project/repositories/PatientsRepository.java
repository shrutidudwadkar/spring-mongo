package com.demo.project.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.project.model.Patients;

public interface PatientsRepository extends MongoRepository<Patients, String> {
	
	

	Patients findBy_id(ObjectId id);

	Patients findByName(String name);
	
	


}
