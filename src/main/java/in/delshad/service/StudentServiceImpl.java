package in.delshad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.delshad.entity.Student;
import in.delshad.repo.StudentRepository;
import in.delshad.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	public String upSert(Student student) {
		Integer sId = student.getSId();
		studentRepository.save(student);
		if (sId == null) {
			return "Record Inserted";
		} else {
			return "Record Updated";
		}

	}

	public List<Student> getStudent() {

		return studentRepository.findAll();
	}

}
