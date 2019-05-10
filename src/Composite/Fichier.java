package Composite;

public class Fichier implements Operation{
    //Leaf
    private String name;

    public Fichier(){
        this.name = name;
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

    public void removeFichier(){
        System.out.println(name + "was removed");
    }
}
