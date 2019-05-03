package FactorySingleton.Prod;

import FactorySingleton.Abstract.Product;
import FactorySingleton.Singleton.Singleton;

public class ProductC implements Product {

    @Override
    public Product createProduct() {
        return (Product) Singleton.getInstance();
    }

    @Override
    public void doJob() {
        System.out.println("I'm ProductC, performing");
    }
}
