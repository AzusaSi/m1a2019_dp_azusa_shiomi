package Cli;

import Abstract.Product;
import Prod.ProductA;
import Prod.ProductB;
import Prod.ProductC;

public class Client {
    Product prod1;
    Product prod2;
    Product prod3;
    Prod.ProductFactory factory;

    public Client(){
        prod1 = new ProductA();
        prod2 = new ProductB();
        prod3 = new ProductC();
    }

    public void doAll(){
        prod1.doJob();
        prod2.doJob();
        prod3.doJob();
    }
}
