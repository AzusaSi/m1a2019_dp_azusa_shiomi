package Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repertoire implements Operation{
    //Composite
    private String name;
    private String id;
    private List<Operation> listFichiers = new ArrayList<Operation>();

    public Repertoire(String name,String id){
        this.name = name;
        this.id = id;
        listFichiers = new ArrayList<Operation>();
    }
    public void addFichier(Operation operation){
        listFichiers.add(operation);
    }

    public void removeFichier(){
        Iterator<Operation> itr = listFichiers.iterator();
        while(itr.hasNext()){
            Operation opr = itr.next();
            opr.removeFichier();
        }
        System.out.println(name + " was removed");
    }

    @Override
    public void lectureSeule() {

    }

    @Override
    public void ecritureSeule() {

    }

    @Override
    public void ecritureFin() {

    }
}
