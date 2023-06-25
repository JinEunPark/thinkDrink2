package com.example.thinkdrink2.domain;

import com.example.thinkdrink2.constant.Activation;
import com.example.thinkdrink2.constant.Gender;
import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
@Getter
@Embeddable
public class HealthInformation {

    Double height;
    Double weight;
    Gender gender;
    Integer age;
    Integer recommendCaffein;
    Double recommendKcal;
    Activation activation;




    //todo 계산하는 로직 service 단에 추가할것
    public void setRecommendKcal(Double recommendKcal){
        this.recommendKcal = recommendKcal;
    }
    public void setRecommendCaffein(int age){
        if(age>=20){
            recommendCaffein = 400;
        }else{
            recommendCaffein = 300;
        }
    }
}