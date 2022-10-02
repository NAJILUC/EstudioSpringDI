package com.bolsadeideas.springboot.springboot.di.app;

import com.bolsadeideas.springboot.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.springboot.di.app.models.service.MiServicio;
import com.bolsadeideas.springboot.springboot.di.app.models.service.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("miServicioSimple")
    public IServicio registrarMiServicio(){
        return new MiServicio();
    }
    @Primary
    @Bean("miServicioComplejo")
    public IServicio registrarMiServicioComplejo(){
        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Camara",50);
        Producto producto2 = new Producto("Moto",90);

        ItemFactura linea1 = new ItemFactura(producto1,4);
        ItemFactura linea2 = new ItemFactura(producto2,1);
        return Arrays.asList(linea1,linea2);
    }

    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("Tv",100);
        Producto producto2 = new Producto("Impresora",90);
        Producto producto3 = new Producto("Escaner",85);
        Producto producto4 = new Producto("Ventilador",50);

        ItemFactura linea1 = new ItemFactura(producto1,4);
        ItemFactura linea2 = new ItemFactura(producto2,1);
        ItemFactura linea3 = new ItemFactura(producto3,5);
        ItemFactura linea4 = new ItemFactura(producto4,3);
        return Arrays.asList(linea1,linea2,linea3,linea4);
    }
}
