package Visitor.model;

import Visitor.contrat.IVisitable;
import Visitor.contrat.IVisitor;

public class Ligne implements IVisitable {
    private String name;

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }

    public String getName(){
        return this.name;
    }

    public Ligne(String name){
        this.name = name;
    }

    public String toString(){
        return "Ligne{"+"name='"+name+'\''+'}';
    }
}
