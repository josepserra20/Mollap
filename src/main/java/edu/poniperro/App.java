package edu.poniperro;

import edu.poniperro.domain.administrador.ProgramadorTasques;
import edu.poniperro.domain.clients.Mollap;
import edu.poniperro.domain.filters.Autenticacio;
import edu.poniperro.domain.filters.Autoritzacio;
import edu.poniperro.domain.targets.Vehicle;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        /**
         * Configuració del programador de tasques
         * del sistema amb el tipus de target triat:
         * des de vehicles a qualsevol cosa que admiteix
         * la recepció d'un missatge.
         */
        ProgramadorTasques programadorTasques = new ProgramadorTasques(new Vehicle());

        /**
         * Afegir al sistema les tasques que volem que el sistema
         * executi al rebre la petició del client.
         */
        programadorTasques.setTasca(new Autenticacio());
        programadorTasques.setTasca(new Autoritzacio());

        /**
         * Configuració de l'app client per a que
         * executi les tasques programades i
         * enviï el misstage al sistema.
         */

        Mollap mollapp = new Mollap();
        mollapp.setProgramadorTasques(programadorTasques);
        mollapp.enviarPeticio("Francesc");
    }
}
