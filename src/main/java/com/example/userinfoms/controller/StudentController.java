package com.example.userinfoms.controller;

import com.example.userinfoms.dto.StudentInfoDto;
import com.example.userinfoms.service.UserInfoService;
import com.example.userinfoms.shares.ApiResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(name = "/career-bridge/students")
@RequiredArgsConstructor
public class StudentController {

private final UserInfoService userInfoService;
    @PostMapping("/post-student")
    ResponseEntity<ApiResponseDto<Void>> postStudent(@RequestBody StudentInfoDto studentInfoDto){
        userInfoService.saveInfo(studentInfoDto);
        return ResponseEntity.ok(ApiResponseDto.<Void>builder()
                        .data(null)
                        .status("Saved successfully")
                .build());
    }
}
