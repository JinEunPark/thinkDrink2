package com.example.thinkdrink2.domain;

import com.example.thinkdrink2.domain.beverage.CafeBeverage;
import com.example.thinkdrink2.domain.beverage.ReadyBeverage;
import jakarta.persistence.*;
import org.springframework.data.relational.core.mapping.Embedded;

@Entity
public class BeverageInputRecord extends BaseTime{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long beverageInputRecodeId;

    @ManyToOne
    CafeBeverage cafeBeverage;

    @ManyToOne
    ReadyBeverage readyBeverage;

    @ManyToOne
    UserEntity userEntity;
}
