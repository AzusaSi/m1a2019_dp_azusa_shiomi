package Composite;

public class Main {
    public static void main(String[] args) {
        Repertoire rep1 = new Repertoire("1","1");
        Repertoire rep2 = new Repertoire("2","2");
        Repertoire rep3 = new Repertoire("3","3");
        Repertoire rep11 = new Repertoire("11","11");
        Repertoire rep22 = new Repertoire("22","22");
        Repertoire rep33 = new Repertoire("33","33");
        Repertoire rep111 = new Repertoire("111","111");
        Repertoire rep222 = new Repertoire("222","222");
        try{
            rep1.addFichier(rep11);
            rep1.addFichier(rep111);
            rep2.addFichier(rep22);
            rep2.addFichier(rep222);
            rep3.addFichier(rep33);
            rep2.removeFichier();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
