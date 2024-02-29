package in.delshad.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.delshad.entity.Student;
import in.delshad.service.StudentService;

@RestController
public class StudentRestController {
	@Autowired
	StudentService studentService;

	@PostMapping("/saveStudentDetails")
	public ResponseEntity<String> saveStudent(@RequestBody Student student) {
		String upSertMsg = studentService.upSert(student);
		return new ResponseEntity<String>(upSertMsg, HttpStatus.CREATED);
	}

	@PutMapping("/updateStudentDtls")
	public ResponseEntity<String> updateStudent(@RequestBody Student student) {
		String upSertMsg = studentService.upSert(student);
		return new ResponseEntity<String>(upSertMsg, HttpStatus.OK);
	}

	@GetMapping(value = "/getStudentDtls", produces = { "Application/json", "Application/xml" }, consumes = {
			"Application/json" })
	public ResponseEntity<List<Student>> getStudent(Integer id) {
		List<Student> student = studentService.getStudent();
		return new ResponseEntity<List<Student>>(student, HttpStatus.OK);
	}

}
