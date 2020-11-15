package com.tz.demo.spi.ext1;

import com.tz.demo.spi.Car;

/**
 * @Author: zhengshundong
 * @Date: 2020/11/15
 * @FileName: Ford
 * @Version: 1.0
 * @Description:
 **/
public class Ford implements Car {
    public String getCarName() {
        return "I am Ford Car";
    }
}
