package com.example.jse.m02.s09;

public class SwitchLight {
    public static void main(String[] args) {
        TrafficLight light = Math.random() > .5 ? TrafficLight.GREEN
                : Math.random() > .5 ? TrafficLight.YELLOW : TrafficLight.RED;

        switch (light) {
        case GREEN:
            System.out.println("You can go");
            break;
        case YELLOW:
            System.out.println("Stop, if you can");
            break;
        case RED:
            System.out.println("Stop!");
            break;
        }
    }
}