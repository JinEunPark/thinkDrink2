package com.example.thinkdrink2.domain.beverage;

import com.example.thinkdrink2.domain.BeverageInformation;
import jakarta.persistence.*;
@Entity
@DiscriminatorValue("ready_beverage")
public class ReadyBeverage extends Beverage {

}
