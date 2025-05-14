<<<<<<< HEAD
package com.javakar.springbootbestpractices.authentication;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import com.javakar.springbootbestpractices.authentication.config.JwtUtils;
import com.javakar.springbootbestpractices.authentication.request.LoginRequest;
import com.javakar.springbootbestpractices.authentication.request.SignupRequest;
import com.javakar.springbootbestpractices.authentication.response.JwtResponse;
import com.javakar.springbootbestpractices.authentication.response.MessageResponse;
import com.javakar.springbootbestpractices.authentication.role.Role;
import com.javakar.springbootbestpractices.authentication.role.RoleEnum;
import com.javakar.springbootbestpractices.authentication.role.RoleRepository;
import com.javakar.springbootbestpractices.authentication.user.User;
import com.javakar.springbootbestpractices.authentication.user.UserDetailsImpl;
import com.javakar.springbootbestpractices.authentication.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder encoder;
    private final JwtUtils jwtUtils;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        List<String> roles = userDetails.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());

        return ResponseEntity.ok(new JwtResponse(jwt,
                userDetails.getId(),
                userDetails.getUsername(),
                userDetails.getEmail(),
                roles));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
        if (userRepository.existsByUsername(signUpRequest.getUsername())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Username is already taken!"));
        }

        if (userRepository.existsByEmail(signUpRequest.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Email is already in use!"));
        }

        // Create new user's account
        User user = new User(signUpRequest.getUsername(),
                signUpRequest.getEmail(),
                encoder.encode(signUpRequest.getPassword()));

        Set<String> strRoles = signUpRequest.getRole();
        Set<Role> roles = new HashSet<>();

        if (strRoles == null) {
            Role userRole = roleRepository.findByName(RoleEnum.ROLE_USER)
                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
            roles.add(userRole);
        } else {
            strRoles.forEach(role -> {
              switch (role) {
                case "admin" -> {
                  Role adminRole = roleRepository.findByName(RoleEnum.ROLE_ADMIN)
                          .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                  roles.add(adminRole);
                }
                case "mod" -> {
                  Role modRole = roleRepository.findByName(RoleEnum.ROLE_MODERATOR)
                          .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                  roles.add(modRole);
                }case "stu" -> {
                  Role modRole = roleRepository.findByName(RoleEnum.ROLE_STUDENT)
                          .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                  roles.add(modRole);
                }
                default -> {
                  Role userRole = roleRepository.findByName(RoleEnum.ROLE_USER)
                          .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                  roles.add(userRole);
                }
              }
            });
        }

        user.setRoles(roles);
        userRepository.save(user);

        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }
}
=======
package com.javakar.springbootbestpractices.authentication;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import com.javakar.springbootbestpractices.authentication.config.JwtUtils;
import com.javakar.springbootbestpractices.authentication.request.LoginRequest;
import com.javakar.springbootbestpractices.authentication.request.SignupRequest;
import com.javakar.springbootbestpractices.authentication.response.JwtResponse;
import com.javakar.springbootbestpractices.authentication.response.MessageResponse;
import com.javakar.springbootbestpractices.authentication.role.Role;
import com.javakar.springbootbestpractices.authentication.role.RoleEnum;
import com.javakar.springbootbestpractices.authentication.role.RoleRepository;
import com.javakar.springbootbestpractices.authentication.user.User;
import com.javakar.springbootbestpractices.authentication.user.UserDetailsImpl;
import com.javakar.springbootbestpractices.authentication.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder encoder;
    private final JwtUtils jwtUtils;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        List<String> roles = userDetails.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());

        return ResponseEntity.ok(new JwtResponse(jwt,
                userDetails.getId(),
                userDetails.getUsername(),
                userDetails.getEmail(),
                roles));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
        if (userRepository.existsByUsername(signUpRequest.getUsername())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Username is already taken!"));
        }

        if (userRepository.existsByEmail(signUpRequest.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Email is already in use!"));
        }

        // Create new user's account
        User user = new User(signUpRequest.getUsername(),
                signUpRequest.getEmail(),
                encoder.encode(signUpRequest.getPassword()));

        Set<String> strRoles = signUpRequest.getRole();
        Set<Role> roles = new HashSet<>();

        if (strRoles == null) {
            Role userRole = roleRepository.findByName(RoleEnum.ROLE_USER)
                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
            roles.add(userRole);
        } else {
            strRoles.forEach(role -> {
              switch (role) {
                case "admin" -> {
                  Role adminRole = roleRepository.findByName(RoleEnum.ROLE_ADMIN)
                          .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                  roles.add(adminRole);
                }
                case "mod" -> {
                  Role modRole = roleRepository.findByName(RoleEnum.ROLE_MODERATOR)
                          .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                  roles.add(modRole);
                }case "stu" -> {
                  Role modRole = roleRepository.findByName(RoleEnum.ROLE_STUDENT)
                          .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                  roles.add(modRole);
                }
                default -> {
                  Role userRole = roleRepository.findByName(RoleEnum.ROLE_USER)
                          .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                  roles.add(userRole);
                }
              }
            });
        }

        user.setRoles(roles);
        userRepository.save(user);

        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }
}
>>>>>>> origin/main
