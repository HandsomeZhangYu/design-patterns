package com.design.factory.factory;import com.design.factory.Vehicle;/** * @author Zhang Yu */public class LargeCar implements Vehicle {    public void product() {        System.out.println("product LargeCar");    }    public Vehicle newInstance() {        return null;    }}