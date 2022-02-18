package edu.poniperro.domain.filters;

public class Autenticacio implements Filtre {

    @Override
    public void execucio(String id) {
        System.out.println("Autenticacio OK per a " + id.toString());
        
    }
    
}
