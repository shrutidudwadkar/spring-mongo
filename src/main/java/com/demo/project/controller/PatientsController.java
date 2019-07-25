package com.demo.project.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.model.Patients;
import com.demo.project.repositories.PatientsRepository;

@RestController
@RequestMapping("/patients")
public class PatientsController {

	@Autowired
	private PatientsRepository repository;
	
	@RequestMapping(value = "/", method= RequestMethod.GET)
	public List<Patients> getPatients() {
		return repository.findAll();
		
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Patients getPatientById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
		
	}
	
	@RequestMapping(value="/get/{name}", method = RequestMethod.GET)
	public Patients getPatientById(@PathVariable("name") String name) {
		return repository.findByName(name);
		
	}
	
	@RequestMapping(value = "/add", method=RequestMethod.POST)
	public Patients insertPatient(@RequestBody Patients patient) {
		patient.set_id(ObjectId.get());
		repository.save(patient);
		return patient;
	}
	
	@RequestMapping(value = "/delete/{id}", method=RequestMethod.DELETE)
	public void deletePatient(@PathVariable("id") ObjectId id) {
		
		repository.delete(repository.findBy_id(id));
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public Patients updateById(@PathVariable("id") ObjectId id, @RequestBody Patients patient) {
		patient.set_id(id);
		repository.save(patient);
		return patient;
		
	}
}
