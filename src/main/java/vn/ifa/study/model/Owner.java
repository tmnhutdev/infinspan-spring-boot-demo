package vn.ifa.study.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
//@AllArgsConstructor
public class Owner {
    
    private String id;
    
    private String fullname;
    
    private int old;
    
    private List<Car> ownedCars;

}
