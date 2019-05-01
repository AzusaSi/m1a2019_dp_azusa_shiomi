package Prod;

import Abstract.Product;
import Singleton.Singleton;

public class ProductB implements Product{

    @Override
    public Product createProduct() {
        return (Product) Singleton.getInstance();
    }

    @Override
    public void doJob() {
        System.out.println("I'm ProductB, doing it");
    }
}
