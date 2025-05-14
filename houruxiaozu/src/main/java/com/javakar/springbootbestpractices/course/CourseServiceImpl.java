<<<<<<< HEAD
package com.javakar.springbootbestpractices.course;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CoursesService{

    private final CourseRepository courseRepository;

    @Override
    public Course saveCourse(CourseDto courseDto) {
        Course course = new Course().setCourseName(courseDto.getCourseName())
                .setCourseDuration(courseDto.getCourseDuration());
        return courseRepository.save(course);
    }

    @Override
    public Optional<Course> findCourseById(long id) {
        return courseRepository.findById(id);
    }

    @Override
    public List<CourseDto> saveAllCourse(List<CourseDto> courseDtoList) {
        if (!CollectionUtils.isEmpty(courseDtoList)){
           List<Course> savedCourses =  courseRepository.saveAll(courseDtoList.stream()
                   .map(courseDto -> new Course()
                    .setCourseDuration(courseDto.getCourseDuration())
                    .setCourseName(courseDto.getCourseName())
            ).collect(Collectors.toList()));

           if (!CollectionUtils.isEmpty(savedCourses)){
              return savedCourses.stream().map(savedCourse -> CourseDto.builder()
               .courseName(savedCourse.getCourseName())
               .courseDuration(savedCourse.getCourseDuration()).build()).collect(Collectors.toList());
           }
        }
        return Collections.emptyList();
    }

    @Override
    public CourseDto updateCourse(CourseDto courseDto) {
        Course savedCourse = courseRepository.findById(courseDto.getId()).get();
        savedCourse.setCourseName(courseDto.getCourseName());
        savedCourse.setCourseDuration(courseDto.getCourseDuration());
        Course course = courseRepository.save(savedCourse);
        return CourseDto.builder()
                .courseName(course.getCourseName())
                .courseDuration(course.getCourseDuration())
                .build();
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public void deleteAllCourse(List<CourseDto> courseDtoList) {
        courseRepository.deleteAll(courseDtoList.stream()
                .map(CourseDto::toCourse)
                .collect(Collectors.toList()));
    }

    @Override
    public List<CourseDto> findAllCourses() {
        List<Course> courses = courseRepository.findAll();
        if(!CollectionUtils.isEmpty(courses)) {
            return courses.stream().map(course -> CourseDto.builder()
                    .id(course.getId())
                    .courseName(course.getCourseName())
                    .courseName(course.getCourseName())
                    .courseDuration(course.getCourseDuration()).build()
            ).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    @Override
    public void findCoursesByStudent(CourseDto courseDto) {

    }
}
=======
package com.javakar.springbootbestpractices.course;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CoursesService{

    private final CourseRepository courseRepository;

    @Override
    public Course saveCourse(CourseDto courseDto) {
        Course course = new Course().setCourseName(courseDto.getCourseName())
                .setCourseDuration(courseDto.getCourseDuration());
        return courseRepository.save(course);
    }

    @Override
    public Optional<Course> findCourseById(long id) {
        return courseRepository.findById(id);
    }

    @Override
    public List<CourseDto> saveAllCourse(List<CourseDto> courseDtoList) {
        if (!CollectionUtils.isEmpty(courseDtoList)){
           List<Course> savedCourses =  courseRepository.saveAll(courseDtoList.stream()
                   .map(courseDto -> new Course()
                    .setCourseDuration(courseDto.getCourseDuration())
                    .setCourseName(courseDto.getCourseName())
            ).collect(Collectors.toList()));

           if (!CollectionUtils.isEmpty(savedCourses)){
              return savedCourses.stream().map(savedCourse -> CourseDto.builder()
               .courseName(savedCourse.getCourseName())
               .courseDuration(savedCourse.getCourseDuration()).build()).collect(Collectors.toList());
           }
        }
        return Collections.emptyList();
    }

    @Override
    public CourseDto updateCourse(CourseDto courseDto) {
        Course savedCourse = courseRepository.findById(courseDto.getId()).get();
        savedCourse.setCourseName(courseDto.getCourseName());
        savedCourse.setCourseDuration(courseDto.getCourseDuration());
        Course course = courseRepository.save(savedCourse);
        return CourseDto.builder()
                .courseName(course.getCourseName())
                .courseDuration(course.getCourseDuration())
                .build();
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public void deleteAllCourse(List<CourseDto> courseDtoList) {
        courseRepository.deleteAll(courseDtoList.stream()
                .map(CourseDto::toCourse)
                .collect(Collectors.toList()));
    }

    @Override
    public List<CourseDto> findAllCourses() {
        List<Course> courses = courseRepository.findAll();
        if(!CollectionUtils.isEmpty(courses)) {
            return courses.stream().map(course -> CourseDto.builder()
                    .id(course.getId())
                    .courseName(course.getCourseName())
                    .courseName(course.getCourseName())
                    .courseDuration(course.getCourseDuration()).build()
            ).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    @Override
    public void findCoursesByStudent(CourseDto courseDto) {

    }
}
>>>>>>> origin/main
