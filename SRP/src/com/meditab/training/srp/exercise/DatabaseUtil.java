package com.meditab.training.srp.exercise;

import java.awt.List;
import java.util.Arrays;

public class DatabaseUtil {
	
	DatabaseStorage getDatabaseInstance() {
		return new DatabaseStorage();
	}
	
		public String getCarsNames()
	    {
	        StringBuilder sb = new StringBuilder();
	        DatabaseStorage _carsDb = getDatabaseInstance();
	        for (Car car : _carsDb) {
	            sb.append(car.toStringCarName());
	            sb.append(", ");
	        }
	        return sb.substring(0, sb.length() - 2);
	    }
	    
	    
	    public List<Car> getAllCars(){
	    	 DatabaseStorage _carsDb = getDatabaseInstance();
	    	return _carsDb;
	    }

}
