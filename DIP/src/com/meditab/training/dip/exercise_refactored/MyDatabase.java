package com.meditab.training.dip.exercise;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase
{
    private static int _count = 0;
    public int write(String inputString, Map<Integer, String> _data)
    {
        _data.put(++_count, inputString);
        return _count;
    }
}
