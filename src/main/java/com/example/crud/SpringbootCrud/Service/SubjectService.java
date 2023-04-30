package com.example.crud.SpringbootCrud.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.SpringbootCrud.Bean.Subject;
import com.example.crud.SpringbootCrud.Repository.SubjectRepository;

@Service
public class SubjectService {
	@Autowired
	public SubjectRepository subjectRepo;

	public List<Subject>findAllSubjects(){
		List<Subject>subjectList = new ArrayList<>();
		subjectRepo.findAll().forEach(subjectList::add);
		return subjectList;
	}

	public void addSubject(Subject subject) {
		// TODO Auto-generated method stub
		subjectRepo.save(subject);
	}

	public void updateSubject(String id, Subject subject) {
		// TODO Auto-generated method stub
		subjectRepo.save(subject);
	}

	public void deleteSubjects(String id) {
		// TODO Auto-generated method stub
		subjectRepo.deleteById(id);
	}
}

