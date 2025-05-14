<<<<<<< HEAD
package com.javakar.springbootbestpractices.course;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {

    private long id;
    @NotNull @NotEmpty
    private String courseName;
    @Min(value = 1, message = "The number of bags must be greater than 0")
    private int courseDuration;

    public Course toCourse(){
        return new Course()
                .setCourseName(courseName)
                .setCourseDuration(courseDuration);
    }
}
=======
package com.javakar.springbootbestpractices.course;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {

    private long id;
    @NotNull @NotEmpty
    private String courseName;
    @Min(value = 1, message = "The number of bags must be greater than 0")
    private int courseDuration;

    public Course toCourse(){
        return new Course()
                .setCourseName(courseName)
                .setCourseDuration(courseDuration);
    }
}
>>>>>>> origin/main
