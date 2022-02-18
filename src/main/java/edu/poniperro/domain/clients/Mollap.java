package edu.poniperro.domain.clients;

import edu.poniperro.domain.administrador.ProgramadorTasques;

public class Mollap implements Client {

    private ProgramadorTasques programador = null;

    public Mollap() {};

    public void setProgramadorTasques(ProgramadorTasques programador) {
        this.programador = programador;
    }

    public void enviarPeticio(String peticio) {
        this.programador.executarTasques(peticio);
    }
}
