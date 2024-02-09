package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDao {
     public static List<Car> cars;

    static {
        init();
    }

    private static void init(){
        cars = new ArrayList<>();
        cars.add(new Car("Opel","Ascona", 160));
        cars.add(new Car("BMW","320", 200));
        cars.add(new Car("Hamvee","Super", 150));
        cars.add(new Car("Mazda","3", 190));
        cars.add(new Car("Roscosmos","Buran", 1600));
    }


}
