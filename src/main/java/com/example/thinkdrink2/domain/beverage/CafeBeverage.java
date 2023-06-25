package com.example.thinkdrink2.domain.beverage;

import com.example.thinkdrink2.domain.BeverageInformation;
import com.example.thinkdrink2.domain.Cafe;
import jakarta.persistence.*;
@Entity
@DiscriminatorValue("cafe_beverage")
public class CafeBeverage extends Beverage{

    @ManyToOne
    Cafe cafe;
}
