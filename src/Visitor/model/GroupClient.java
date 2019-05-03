package Visitor.model;

import Visitor.contrat.IVisitable;
import Visitor.contrat.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class GroupClient implements IVisitable {
    private  String name;
    public List<Client> clients = new ArrayList<Client>();

    public void accept(IVisitor visitor){

    }

    public String getName(){
        return this.name= name;
    }

    public void addClient(Client client){
        this.clients.add(client);
    }

    public GroupClient(String name){
        this.name = name;
    }
}
