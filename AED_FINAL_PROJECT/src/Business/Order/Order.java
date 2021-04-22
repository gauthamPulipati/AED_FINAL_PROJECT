/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Products.Product;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author aksha
 */
public class Order extends WorkRequest {
  
    private String id;
    private ArrayList<Product> items;
    private int quantity;
    private int price;
    
    public Order(){
        items = new ArrayList();
        Random random = new Random();
        this.id = String.valueOf(random.nextInt(99999));
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    public String getId() {
        return id;
    }
    
    
    public void addItem(Product product, int quantity){
        this.items.add(product);
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    public ArrayList<Product> getItems() {
        return items;
    }

    public int getQuantity() {
        return quantity;
    }
    
    @Override
    public String toString(){
        return this.id;
    } 
}
