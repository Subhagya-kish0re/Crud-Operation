package com.example.crud.SpringbootCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.SpringbootCrud.Bean.Subject;
import com.example.crud.SpringbootCrud.Service.SubjectService;

@RestController
public class SubjectController {
	@Autowired
	public SubjectService subService;
	
	@GetMapping("/testApi")
	public String testApplication() {
		return "The Application is up and running";
	}
	@RequestMapping("/allsubjects")
	public List<Subject> getAllSubjects(){
		return subService.findAllSubjects();
	}
	
	@RequestMapping(method= RequestMethod.POST, value="/subjects")
	public void addSubject(@RequestBody Subject subject) {
		subService.addSubject(subject);
	}
	
	@RequestMapping(method= RequestMethod.PUT, value="/subjects/{id}")
	public void updateSubject(@PathVariable String id, Subject subject) {
		subService.updateSubject(id,subject);
	}
	@RequestMapping(method= RequestMethod.DELETE, value="/subjects/{id}")
	public void deleteSubject(@PathVariable String id) {
		subService.deleteSubjects(id);
	}
}
