package com.design.factory;/** * @author Zhang Yu */public class Bike implements Vehicle{    public Bike newInstance() {        return new Bike();    }    public void product() {        System.out.println("product Bike");    }}