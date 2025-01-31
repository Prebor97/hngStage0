package com.example.hngStage0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class HngService {

    @Autowired
    private DateUtil dateUtil;

    public ResponseDto getInfo(){
        ResponseDto responseDto = new ResponseDto();
        String email = "prebstamar@gmail.com";
        String gitHubUrl = "Git url";
        LocalDate date = LocalDate.now();
        String presentDate = dateUtil.formatUsingDateTimeFormatter(date);
        responseDto.setEmail(email);
        responseDto.setDate(presentDate);
        responseDto.setGitHubUrl(gitHubUrl);
        return responseDto;
    }

}
