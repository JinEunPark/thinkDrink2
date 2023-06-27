package com.example.thinkdrink2.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class BeverageInformation {
    String beverageName;
    String beverageImage;
    String liter;
    String shape;
    Double natrium;
    Double caffein;
    Double kcal;
}
