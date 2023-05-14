package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.beans.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	
	private final StudentRepository studentRepository ;
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	public List<Student> getStudents(){
		return studentRepository.findAll();
	}



	public Student addNewStudent(Student student) {
		Optional<Student> studentByEmail = studentRepository.findStudentbyEmail(student.getEmail());
		
		if(studentByEmail.isPresent()) {
			throw new IllegalStateException("email taken");
		}
		
		Student studentobj = studentRepository.save(student);
		return studentobj;
	}



	public void deleteStudent(int id) {
		
	boolean exists= studentRepository.existsById((long) id);
		if(!exists) {
			
		}
		studentRepository.deleteById((long) id);
	}


	@Transactional
	public void updateStudent(long id, String name, String email) {
		Student student=studentRepository.findById( id)
				.orElseThrow(()-> new IllegalStateException("student with id" + id + "does not exist"));
		
		if (name!= null && name.length()>0 && !Objects.equals(student.getName(), name)) {
			student.setName(name);
		}
		
		if (email!= null && email.length()>0 && !Objects.equals(student.getEmail(), email)) {
			Optional<Student> studentByEmail = studentRepository.findStudentbyEmail(email);
			
			if(studentByEmail.isPresent()) {
				throw new IllegalStateException("email taken");
			}
			
			student.setEmail(email);
		}
		
	}
}
