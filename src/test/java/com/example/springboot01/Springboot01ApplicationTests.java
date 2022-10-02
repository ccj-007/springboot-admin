package com.example.springboot01;

import com.example.springboot01.controller.CreatePeople;
import com.example.springboot01.controller.PeopleBuyRecord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01ApplicationTests {
    @Autowired
    private PeopleBuyRecord peopleBuyRecord;
    //private CreatePeople createPeople;

    @Test
    void contextLoads() {
        System.out.println(peopleBuyRecord);
    }

}
