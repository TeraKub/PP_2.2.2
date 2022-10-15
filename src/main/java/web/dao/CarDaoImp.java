package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao{
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMV", "black", 375));
        cars.add(new Car("UAZ", "khaki", 666));
        cars.add(new Car("Honda", "red", 482));
        cars.add(new Car("BMV", "silver", 777));
        cars.add(new Car("Lada", "white", 182));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > cars.size() || count == 0) {
            count = cars.size();
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }





//    @Override
//    public List<Car> getCars(int count) {
//        if (count > cars.size() || count == 0) {
//            count = cars.size();
//        }
//        List<Car> newCars;
//        newCars = cars.stream().limit(count).collect(Collectors.toList());
//        System.out.println(count);
//        System.out.println(newCars);
//
//        return newCars;
//    }

//    public List<Car> getCars() {
//        System.out.println("Non param");
//        return cars;
//    }
}
