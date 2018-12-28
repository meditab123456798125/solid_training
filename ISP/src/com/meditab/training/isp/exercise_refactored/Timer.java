package com.meditab.training.isp.exercise;

import java.util.TimerTask;

public class Timer implements TimedOutCallBack
{
    public void register(long timeOut)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                timeOutCallback();
            }
        }, timeOut);
    }
}
