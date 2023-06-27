package com.example.thinkdrink2.domain.beverage;

import com.example.thinkdrink2.domain.BeverageInformation;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)	// 상속 전략
@DiscriminatorColumn(name="type")		// 구분 하는 칼럼
public  class Beverage {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long beverageId;

    @Embedded
    BeverageInformation beverageInformation;
}
