package vn.ifa.study.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
//@AllArgsConstructor
public class Car {
    
    private String model;
    
    private String color;
    
    private String carNumber;

}
