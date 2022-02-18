package edu.poniperro.domain.targets;

public class Vehicle implements Target {
    
    public Vehicle() {};

    public void execucio(String id) {
        System.out.println("Porta oberta " + id.toString() + "!");
    }
}
