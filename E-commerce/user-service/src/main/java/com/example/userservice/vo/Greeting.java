package com.example.userservice.vo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //bean으로 등록하기 위함, 용도가 정해지지 않은 경우 component로
@Data
//@AllArgsConstructor args를 모두 가지고 있는 생성자
//@NoArgsConstructor default 생성자(args가 없는)
public class Greeting {
    @Value("${greeting.message}") //yml 파일에 있는 설정을 가져옴
    private String message;
}