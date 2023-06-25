package com.example.thinkdrink2.domain;

import com.example.thinkdrink2.domain.beverage.CafeBeverage;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cafe {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long cafeId;

    @Column(unique = true)
    String cafeName;

    @OneToMany(mappedBy = "cafe")
    List<CafeBeverage> cafeBeverages = new ArrayList<>();
}
