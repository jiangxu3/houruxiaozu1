<<<<<<< HEAD
package com.javakar.springbootbestpractices.student;

import com.javakar.springbootbestpractices.authentication.user.User;
import com.javakar.springbootbestpractices.authentication.user.UserDto;

import java.util.List;

public interface StudentService {

    UserDto createStudent(UserDto userDto);
    List<UserDto> createStudents(List<UserDto> userDtoList);
    UserDto findStudentById(Long studentId);
    List<UserDto> findAllStudents();
    UserDto updateStudent(UserDto userDto);
    List<UserDto> updateStudents(List<UserDto> userDtoList);
    void deleteStudent(UserDto userDto);
    void deleteStudents(List<UserDto> userDtoList);
    void findStudentsByCourse(User user);

}
=======
package com.javakar.springbootbestpractices.student;

import com.javakar.springbootbestpractices.authentication.user.User;
import com.javakar.springbootbestpractices.authentication.user.UserDto;

import java.util.List;

public interface StudentService {

    UserDto createStudent(UserDto userDto);
    List<UserDto> createStudents(List<UserDto> userDtoList);
    UserDto findStudentById(Long studentId);
    List<UserDto> findAllStudents();
    UserDto updateStudent(UserDto userDto);
    List<UserDto> updateStudents(List<UserDto> userDtoList);
    void deleteStudent(UserDto userDto);
    void deleteStudents(List<UserDto> userDtoList);
    void findStudentsByCourse(User user);

}
>>>>>>> origin/main
