package com.group.special_work_exam;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.group.special_work_exam.*.dao")
@EnableSwagger2Doc
public class SpecialWorkExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpecialWorkExamApplication.class, args);
    }

}
