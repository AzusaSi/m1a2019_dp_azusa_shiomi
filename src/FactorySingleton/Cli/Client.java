package FactorySingleton.Cli;

import FactorySingleton.Abstract.Product;
import FactorySingleton.Prod.ProductA;
import FactorySingleton.Prod.ProductB;
import FactorySingleton.Prod.ProductC;
import FactorySingleton.Prod.ProductFactory;

public class Client {
    private Product prod1;
    private Product prod2;
    private Product prod3;
    ProductFactory factory;

    Client(){
        prod1 = new ProductA();
        prod2 = new ProductB();
        prod3 = new ProductC();
    }

    void doAll(){
        prod1.doJob();
        prod2.doJob();
        prod3.doJob();
    }
}
