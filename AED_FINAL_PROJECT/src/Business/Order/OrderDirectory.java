/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class OrderDirectory {
    
    private ArrayList<Order> orders;
    
    public OrderDirectory(){
        orders = new ArrayList();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    
    public Order newOrder(){
        Order order = new Order();
        orders.add(order);
        return order;
    }
    
    public Order getOrderID(String id){
        for (Order order : orders){
            if(order.getOrderID().equals(id)){
                return order;
            }
        }
        return null;
    }
    
}
