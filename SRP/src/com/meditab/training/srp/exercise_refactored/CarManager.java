package com.meditab.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager{
	
	
	public Car getBestCar()
    {
        DatabaseUtil util = new DatabaseUtil();
        List<Car> _cars = (List<Car>) util.getAllCars();
		Car bestCar = null;
        for (Car car : _cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
	
	public String getCarsNames()
    {
		DatabaseUtil util = new DatabaseUtil();
		return util.getCarsNames();
    }
	
	public Car getSingleCar(final String carId)
	{
		DatabaseUtil util = new DatabaseUtil();
    	for (Car car : (List<Car>) util.getAllCars()) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }
	
   
}
