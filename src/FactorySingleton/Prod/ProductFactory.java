package FactorySingleton.Prod;

import FactorySingleton.Abstract.Product;

public class ProductFactory{
    private String product;

    public ProductFactory(String product){
        this.product = product;
    }

    public Product createProduct(){
        if(product.equals("ProductA")){
            return new ProductA();
        }
        if(product.equals("ProductB")){
            return new ProductB();
        }
        if(product.equals("ProductC")){
            return new ProductC();
        }
        return new ProductA();
    }
}
