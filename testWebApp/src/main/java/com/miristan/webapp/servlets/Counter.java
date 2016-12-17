package com.miristan.webapp.servlets;

/**
 * Created by DEV on 09-12-2016.
 */
public class Counter
{

    private static int counter=0;

    public static void incCount()
    {
        counter++;
    }

    public static int getCount()
    {
        return counter;
    }
}
