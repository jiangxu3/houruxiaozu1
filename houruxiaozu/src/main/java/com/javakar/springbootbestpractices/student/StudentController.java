package com.javakar.springbootbestpractices.student;

import com.javakar.springbootbestpractices.authentication.user.UserDto;
import com.javakar.springbootbestpractices.response.ResponseHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentServiceImpl studentService;
    // 30 june 2022 closing balance // savings

    @PostMapping
    public ResponseEntity<Object> createStudent(@RequestBody @Valid UserDto userDto) {
        if (Objects.isNull(userDto)) {
            return ResponseHandler.response(0, "Please provide student", HttpStatus.NO_CONTENT);
        }
        userDto = studentService.createStudent(userDto);
        if (Objects.nonNull(userDto)) {
            return ResponseHandler.response(1, "Success", HttpStatus.CREATED);
        }
        return ResponseHandler.response(0, "Something went wrong", HttpStatus.NO_CONTENT);
    }


    @PostMapping("/all")
    public ResponseEntity<Object> createStudents(@RequestBody @Valid List<UserDto> userDtoList) {
        if (CollectionUtils.isEmpty(userDtoList)) {
            return ResponseHandler.response(0, "Please provide students", HttpStatus.NO_CONTENT);
        }
        userDtoList = studentService.createStudents(userDtoList);
        if (!CollectionUtils.isEmpty(userDtoList)) {
            return ResponseHandler.response(1, "Success", HttpStatus.CREATED);
        }
        return ResponseHandler.response(0, "Something went wrong", HttpStatus.NO_CONTENT);
    }


    @GetMapping("/{studentId}")
    public ResponseEntity<Object> findStudentById(@PathVariable long studentId) {
        if (studentId <= 0) {
            return ResponseHandler.response(0, "Please provide students", HttpStatus.NO_CONTENT);
        }
        UserDto userDto = studentService.findStudentById(studentId);
        if (Objects.nonNull(userDto)) {
            return ResponseHandler.response(1, userDto, "Success", HttpStatus.CREATED);
        }
        return ResponseHandler.response(0, "Something went wrong", HttpStatus.NO_CONTENT);
    }


    @GetMapping
    public ResponseEntity<Object> findAllStudents() {
        List<UserDto> userDtoList = studentService.findAllStudents();
        if (!CollectionUtils.isEmpty(userDtoList)) {
            return ResponseHandler.response(1, userDtoList, "Success", HttpStatus.CREATED);
        }
        return ResponseHandler.response(0, "Something went wrong", HttpStatus.NO_CONTENT);
    }


    @PutMapping
    public ResponseEntity<Object> updateStudent(@RequestBody @Valid UserDto userDto) {
        if (Objects.isNull(userDto)) {
            return ResponseHandler.response(0, "Please provide student", HttpStatus.NO_CONTENT);
        }
        userDto = studentService.updateStudent(userDto);
        if (Objects.nonNull(userDto)) {
            return ResponseHandler.response(1, userDto, "Success", HttpStatus.CREATED);
        }
        return ResponseHandler.response(0, "Something went wrong", HttpStatus.NO_CONTENT);
    }


    @PutMapping("/all")
    public ResponseEntity<Object> updateStudents(@RequestBody @Valid List<UserDto> userDtoList) {
        if (CollectionUtils.isEmpty(userDtoList)) {
            return ResponseHandler.response(0, "Please provide students", HttpStatus.NO_CONTENT);
        }
        userDtoList = studentService.updateStudents(userDtoList);
        if (!CollectionUtils.isEmpty(userDtoList)) {
            return ResponseHandler.response(1, userDtoList, "Success", HttpStatus.CREATED);
        }
        return ResponseHandler.response(0, "Something went wrong", HttpStatus.NO_CONTENT);
    }


    @DeleteMapping
    public ResponseEntity<Object> deleteStudent(@RequestBody @Valid UserDto userDto) {
        if (Objects.isNull(userDto)) {
            return ResponseHandler.response(0, "Please provide student", HttpStatus.NO_CONTENT);
        }
        studentService.deleteStudent(userDto);
        return ResponseHandler.response(1, "Success", HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/all")
    public ResponseEntity<Object> deleteStudents(@RequestBody @Valid List<UserDto> userDtoList) {
        if (CollectionUtils.isEmpty(userDtoList)) {
            return ResponseHandler.response(0, "Please provide students", HttpStatus.NO_CONTENT);
        }
        studentService.deleteStudents(userDtoList);
        return ResponseHandler.response(1, "Success", HttpStatus.CREATED);
    }


}
