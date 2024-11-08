package Springboot_Mongo_DockerCompose.Controller;

import Springboot_Mongo_DockerCompose.Entity.Student;
import Springboot_Mongo_DockerCompose.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController
{
    @Autowired
    StudentRepository studentRepository;

    @RequestMapping("/test")
    public String test()
    {
        return "Docker Compose test";
    }

    @RequestMapping("/save")
    public String savedata(@RequestBody Student student)
    {
        studentRepository.save(student);
        return "Student data saved";
    }

    @RequestMapping("/show")
    public List<Student> showdata()
    {
       return studentRepository.findAll();
    }
}
