package com.example.thinkdrink2.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class UserEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long userId;

    @Embedded
    HealthInformation healthInformation;

    @OneToMany(mappedBy = "userEntity", orphanRemoval = true)
    List<BeverageInputRecord> inputRecodes = new ArrayList<>();

}
