package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{

    CarsDao carsDao = new CarsDao();

    public CarServiceImpl(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Car> getCars(int count) {
        if (Math.abs(count) >=CarsDao.cars.size()){
            return CarsDao.cars;
        }
        return CarsDao.cars.subList(0,Math.abs(count));
    }
}
