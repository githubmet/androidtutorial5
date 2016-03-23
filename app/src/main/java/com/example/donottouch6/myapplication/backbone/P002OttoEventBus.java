package com.example.donottouch6.myapplication.backbone;


import com.squareup.otto.Bus;

public class P002OttoEventBus {
    private static Bus bus=new Bus();

    public static Bus getBus() {
        return bus;
    }
}
