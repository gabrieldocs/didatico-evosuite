package example.app.controllers;

import example.app.models.Agencia;

public class AgenciaController {
    private Agencia agencia;

    public AgenciaController(Agencia agencia) {
        this.agencia = agencia;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    // Implementa métodos para manipular operaçoes de agencia
}
