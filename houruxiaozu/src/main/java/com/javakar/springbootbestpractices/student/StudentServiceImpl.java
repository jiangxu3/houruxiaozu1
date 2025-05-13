package com.javakar.springbootbestpractices.student;

import com.javakar.springbootbestpractices.authentication.role.Role;
import com.javakar.springbootbestpractices.authentication.role.RoleEnum;
import com.javakar.springbootbestpractices.authentication.role.RoleRepository;
import com.javakar.springbootbestpractices.authentication.user.User;
import com.javakar.springbootbestpractices.authentication.user.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final RoleRepository roleRepository;

    @Override
    public UserDto createStudent(UserDto userDto) {
        Set<Role> roles = new HashSet<>();

        Role studentRole = roleRepository.findByName(RoleEnum.ROLE_STUDENT)
                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
        roles.add(studentRole);
        User user = new User()
                .setUsername(userDto.getUsername())
                .setEmail(userDto.getEmail())
                .setRoles(roles);
        user = studentRepository.save(user);
        return new UserDto(user);


    }

    @Override
    public List<UserDto> createStudents(List<UserDto> userDtoList) {
        return null;
    }

    @Override
    public UserDto findStudentById(Long studentId) {
        return new UserDto(studentRepository.findById(studentId).get());
    }

    @Override
    public List<UserDto> findAllStudents() {
        return studentRepository.findAll().stream()
                .map(UserDto::new
                ).collect(Collectors.toList());
    }

    @Override
    public UserDto updateStudent(UserDto userDto) {
       User savedUser = studentRepository.findById(userDto.getId()).get();
        savedUser.setUsername(userDto.getUsername());
        savedUser.setEmail(userDto.getEmail());
        savedUser.setId(userDto.getId());
        savedUser = studentRepository.save(savedUser);
        return new UserDto(savedUser);
    }

    @Override
    public List<UserDto> updateStudents(List<UserDto> userDtoList) {
        return null;
    }

    @Override
    public void deleteStudent(UserDto userDto) {

    }

    @Override
    public void deleteStudents(List<UserDto> userDtoList) {

    }

    @Override
    public void findStudentsByCourse(User user) {

    }
}
