package com.javakar.springbootbestpractices.course;

import com.javakar.springbootbestpractices.exception.CustomException;
import com.javakar.springbootbestpractices.response.ResponseHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseServiceImpl courseService;

    @PostMapping
    public ResponseEntity<Object> createCourse(@RequestBody @Valid CourseDto courseDto) {
        return ResponseHandler.response(1, courseService.saveCourse(courseDto), "Successfully saved", HttpStatus.CREATED);
    }


    @PostMapping("/all")
    public ResponseEntity<Object> createAllCourses(@RequestBody @Valid List<CourseDto> courseDtoList) {
        if (CollectionUtils.isEmpty(courseDtoList)) {
            return ResponseHandler.response(0, null, "Please provide courses list", HttpStatus.NO_CONTENT);
        }
        courseDtoList = courseService.saveAllCourse(courseDtoList);
        if (!CollectionUtils.isEmpty(courseDtoList)) {
            return ResponseHandler.response(1, Collections.emptyList(), "Successfully saved", HttpStatus.CREATED);
        }
        return ResponseHandler.response(0, null, "Something went wrong", HttpStatus.BAD_REQUEST);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> findCourseById(@PathVariable long id) {
        return ResponseHandler.response(1,
                courseService.findCourseById(id).orElseThrow(() -> new CustomException("Record not found")),
                "Success", HttpStatus.ACCEPTED);
    }


    @GetMapping("/all")
    public ResponseEntity<Object> findAllCourses() {
        return ResponseHandler.response(1, courseService.findAllCourses(), "Success", HttpStatus.ACCEPTED);
    }


    @PutMapping
    public ResponseEntity<Object> update(@RequestBody @Valid CourseDto courseDto) {
        if (courseDto == null) {
            return ResponseHandler.response(0, null, "Please provide course", HttpStatus.NO_CONTENT);
        }
        courseDto = courseService.updateCourse(courseDto);
        return ResponseHandler.response(1, courseDto, "Success", HttpStatus.CREATED);
    }


    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(@PathVariable long id) {
        if (id <= 0) {
            return ResponseHandler.response(0, null, "Please provide course", HttpStatus.NO_CONTENT);
        }
        courseService.deleteCourse(id);
        return ResponseHandler.response(1, null, "Success", HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/all")
    public ResponseEntity<Object> delete(@RequestBody @Valid List<CourseDto> courseDtoList) {
        if (CollectionUtils.isEmpty(courseDtoList)) {
            return ResponseHandler.response(0, null, "Please provide course", HttpStatus.NO_CONTENT);
        }
        courseService.deleteAllCourse(courseDtoList);
        return ResponseHandler.response(1, null, "Success", HttpStatus.ACCEPTED);
    }

}