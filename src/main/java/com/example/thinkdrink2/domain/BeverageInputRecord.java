package com.example.thinkdrink2.domain;

import jakarta.persistence.*;
import org.springframework.data.relational.core.mapping.Embedded;

@Entity
public class BeverageInputRecord extends BaseTime{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long beverageInputRecodeId;

    @Embedded.Nullable //영양정보의 스냅샷
    BeverageInformation beverageInformation;

    @ManyToOne
    UserEntity userEntity;
}
