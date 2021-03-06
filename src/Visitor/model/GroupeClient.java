package Visitor.model;

import Visitor.contrat.IVisitable;
import Visitor.contrat.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class GroupeClient implements IVisitable {
    private  String name;
    public List<Client> clients = new ArrayList<Client>();

    public void accept(IVisitor visitor){
        clients.forEach(x -> x.accept(visitor));
    }

    public String getName(){
        return this.name= name;
    }

    public void addClient(Client client){
        this.clients.add(client);
    }

    public GroupeClient(String name){
        this.name = name;
    }
}
