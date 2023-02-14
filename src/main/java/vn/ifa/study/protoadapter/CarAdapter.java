package vn.ifa.study.protoadapter;

import java.io.Serializable;

import org.infinispan.protostream.annotations.ProtoAdapter;
import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

import vn.ifa.study.model.Car;

@ProtoAdapter(value = Car.class)
public class CarAdapter implements Serializable {

    private static final long serialVersionUID = 1220699547584504164L;

    @ProtoFactory
    Car create(String model, String color, String carNumber) {

        return Car.builder().model(model).color(color).carNumber(carNumber).build();
    }
    
    @ProtoField(number = 1)
    String getModel(final Car car) {
        return car.getModel();
    }
    
    @ProtoField(number = 2)
    String getColor(final Car car) {
        return car.getColor();
    }
    
    @ProtoField(number = 3)
    String getCarNumber(final Car car) {
        return car.getCarNumber();
    }
}
