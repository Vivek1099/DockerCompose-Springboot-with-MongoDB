package Springboot_Mongo_DockerCompose.Repository;

import Springboot_Mongo_DockerCompose.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Integer>
{
}
