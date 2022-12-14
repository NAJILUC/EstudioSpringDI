package com.bolsadeideas.springboot.springboot.di.app.models.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;
import java.util.List;

@Component
@RequestScope
public class Factura {

    @Value("${factura.descripcion}")
    private String descripcion;

    @Autowired
    private Cliente cliente;
    @Autowired
    @Qualifier("itemsFacturaOficina")
    private List<ItemFactura> items;

    @PostConstruct
    public void inicializar(){
        cliente.setNombre(cliente.getNombre().concat(" ").concat("mi bb"));
        descripcion=descripcion.concat(" del cliente: ".concat(cliente.getNombre()));
    }

    @PreDestroy
    public void destruir(){
        System.out.println("Factura destruida; ".concat(descripcion));
    }

    public List<ItemFactura> getItems() {
        return items;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }

    public Cliente getCliente() {

        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
