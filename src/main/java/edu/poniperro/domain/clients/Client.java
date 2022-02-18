package edu.poniperro.domain.clients;
import edu.poniperro.domain.administrador.ProgramadorTasques;

public interface Client {
    void setProgramadorTasques(ProgramadorTasques tasques);

    void enviarPeticio(String peticio);
}
