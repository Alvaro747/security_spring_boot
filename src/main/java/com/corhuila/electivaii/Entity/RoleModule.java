package com.corhuila.electivaii.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "role_module")
public class RoleModule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Role rol;

    @ManyToOne
    @JoinColumn(name = "modulo_id")
    private Module modulo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRol() {
        return rol;
    }

    public void setRol(Role rol) {
        this.rol = rol;
    }

    public Module getModulo() {
        return modulo;
    }

    public void setModulo(Module modulo) {
        this.modulo = modulo;
    }
}
