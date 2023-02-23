package vn.ifa.study.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    
    private String model;
    
    private String color;
    
    private String carNumber;

}
