package com.example.hngStage0;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/getInfo")
@RequiredArgsConstructor
public class HngController {

    @Autowired
    private HngService service;

    @GetMapping("/")
    public ResponseEntity<ResponseDto> getInfo(){
        ResponseDto responseDto = new ResponseDto();
        responseDto = service.getInfo();
        return ResponseEntity.ok(responseDto);
    }
}
