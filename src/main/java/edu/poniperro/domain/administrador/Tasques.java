package edu.poniperro.domain.administrador;

import edu.poniperro.domain.filters.Filtre;
import edu.poniperro.domain.targets.Target;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Tasques {

    private Optional<Target> target;

    private List<Filtre> tasques = new ArrayList<>();

    public Tasques() {};

    public List<Filtre> getTasques(){

        return this.tasques;
    }

    public Optional<Target> getTarget() {

        return this.target;
    }

    public void afegirTasca(Filtre filtre){

        getTasques().add(filtre);
    }

    public void execucio(String missatge){
            
        for (Filtre item : getTasques()) {
                item.execucio(missatge);
            };
            if (getTarget().isPresent()) {
                getTarget().get().execucio(missatge);
            } else {

            }
    }

    public void setTarget(Target target) {

            this.target = Optional.ofNullable(target);
    }
}
