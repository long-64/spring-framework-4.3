package com.mytest.service;

import com.mytest.domain.Car;
import org.springframework.beans.factory.FactoryBean;


public class CarFactoryBean implements FactoryBean<Car> {

    private String carInfo;

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        String [] infos = carInfo.split(",");
        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.valueOf(infos[1]));
        car.setPrice(infos[2]);
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public void setCarInfo(String carInfo){
        this.carInfo = carInfo;
    }
}
