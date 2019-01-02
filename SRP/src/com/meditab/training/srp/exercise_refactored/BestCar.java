package assignment_day3_1;

import java.util.List;

public class BestCar {

	Car bestCar = null;
	CarManager cm = null;
	List<Car> cars  = cm.getallCar();
	
	public Car getBestCar()
	{
		for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
		return bestCar;
	}
}
