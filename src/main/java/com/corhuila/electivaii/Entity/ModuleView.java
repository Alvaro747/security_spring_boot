package com.corhuila.electivaii.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "module_view")
public class ModuleView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "modulo_id")
    private Module modulo;

    @ManyToOne
    @JoinColumn(name = "vista_id")
    private View vista;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Module getModulo() {
        return modulo;
    }

    public void setModulo(Module modulo) {
        this.modulo = modulo;
    }

    public View getVista() {
        return vista;
    }

    public void setVista(View vista) {
        this.vista = vista;
    }
}
