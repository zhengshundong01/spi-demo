package com.tz.demo.spi.ext2;

import com.tz.demo.spi.Car;

/**
 * @Author: zhengshundong
 * @Date: 2020/11/15
 * @Version: 1.0
 * @Description:
 **/
public class BYD implements Car {
    public String getCarName() {
        return "I am BYD Car";
    }
}
