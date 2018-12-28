package com.meditab.training.isp.exercise;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TimedDoor extends Door implements timeOut
{
    private static final int TIME_OUT = 100;
    
    public TimedDoor(Timer timer)
    {
        timer.register(TIME_OUT, this);
    }


    @Override
    public void timeOutCallback()
    {
        _locked = true;
    }
	
}
