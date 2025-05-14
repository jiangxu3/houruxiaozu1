package com.javakar.springbootbestpractices.course;

import java.util.List;
import java.util.Optional;

public interface CoursesService {

    Course saveCourse(CourseDto courseDto);
    List<CourseDto> saveAllCourse(List<CourseDto> courseDtoList);
    Optional<Course> findCourseById(long id);
    List<CourseDto> findAllCourses();
    CourseDto updateCourse(CourseDto courseDto);
    void deleteCourse(Long id);
    void deleteAllCourse(List<CourseDto> courseDtoList);
    void findCoursesByStudent(CourseDto courseDto);
}
