package com.example.userinfoms.service.impl;

import com.example.userinfoms.dto.StudentInfoDto;
import com.example.userinfoms.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserInfoServiceImpl implements UserInfoService {

    @Override
    public void saveInfo(StudentInfoDto studentInfoDto) {
        log.info("saved in db");
    }
}
