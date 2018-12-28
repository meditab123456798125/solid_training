package com.meditab.training.isp.exercise;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SensingDoor extends Door implements proximity
{
    
    public SensingDoor(Sensor sensor)
    {
        sensor.register(this);
    }

    @Override
    public void proximityCallback()
    {
        _opened = true;
    }
}
