package vn.ifa.study.protoadapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.infinispan.protostream.annotations.ProtoAdapter;
import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

import vn.ifa.study.model.Car;
import vn.ifa.study.model.Owner;

@ProtoAdapter(value = Owner.class)
public class OwnerAdapter implements Serializable {

    private static final long serialVersionUID = 8536211381487965337L;

    @ProtoFactory
    Owner create(String id, String fullname, int old, List<Car> ownedCars) {
        
        return Owner.builder().id(id).fullname(fullname).old(old).ownedCars(ownedCars).build();
    }

    @ProtoField(number = 1)
    String getId(final Owner owner) {

        return owner.getId();
    }

    @ProtoField(number = 2)
    String getFullname(final Owner owner) {

        return owner.getFullname();
    }

    @ProtoField(number = 3, defaultValue = "1")
    int getOld(final Owner owner) {

        return owner.getOld();
    }

    @ProtoField(number = 4, collectionImplementation = ArrayList.class)
    List<Car> getOwnedCars(final Owner owner) {

        return owner.getOwnedCars();
    }

}
