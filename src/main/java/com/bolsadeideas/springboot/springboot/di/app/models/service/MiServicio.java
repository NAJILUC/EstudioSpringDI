package com.bolsadeideas.springboot.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioSImple")
//@Primary
public class MiServicio implements IServicio{


    @Override
    public String operacion() {
        return "Ejecutando un proceso simple";
    }
}
