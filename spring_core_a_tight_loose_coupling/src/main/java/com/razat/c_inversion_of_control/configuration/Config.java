package com.razat.c_inversion_of_control.configuration;

import com.razat.c_inversion_of_control.RubberWheel2;
import com.razat.c_inversion_of_control.Wheel2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {
    @Bean
    public List<Wheel2> getListOfWheels(){
        List<Wheel2> wheel2List = new ArrayList<>();
        for(int i=0;i<4;i++){
            wheel2List.add(new RubberWheel2(23.7,"Red"));
        }
        return wheel2List;
    }
}
