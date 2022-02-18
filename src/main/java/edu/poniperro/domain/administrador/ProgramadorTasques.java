package edu.poniperro.domain.administrador;

import edu.poniperro.domain.filters.Filtre;
import edu.poniperro.domain.targets.Target;

public class ProgramadorTasques {

    private Tasques tasques = null;

    public ProgramadorTasques(Target target) {

        tasques = new Tasques();
        tasques.setTarget(target);


    };

    public Tasques getTasques() {

        return this.tasques;
    }

    public void setTasca(Filtre tasca) {
        getTasques().afegirTasca(tasca);
    }

    public void executarTasques(String missatge) {
            tasques.execucio(missatge);
    }
}

