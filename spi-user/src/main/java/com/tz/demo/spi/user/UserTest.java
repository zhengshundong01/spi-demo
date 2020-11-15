package com.tz.demo.spi.user;

import com.tz.demo.spi.Car;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Author: zhengshundong
 * @Date: 2020/11/15
 * @Version: 1.0
 * @Description:
 **/
public class UserTest {

    public static void main (String[] args) {
        ServiceLoader<Car> services = ServiceLoader.load(Car.class);

        Iterator<Car> interator = services.iterator();
        while (interator.hasNext()) {
            Car car = interator.next();
            System.out.println(car.getCarName());
        }
    }
}
