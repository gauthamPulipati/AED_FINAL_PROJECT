/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.ManifacturingWarehouse.ManufacturingWarehouse;
import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class ShippingOrderWorkRequest extends WorkRequest{
    private Order orders;
    private ManufacturingWarehouse manufacturingWarehouse;
    private String message;

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ManufacturingWarehouse getManufacturingWarehouse() {
        return manufacturingWarehouse;
    }

    public void setManufacturingWarehouse(ManufacturingWarehouse manufacturingWarehouse) {
        this.manufacturingWarehouse = manufacturingWarehouse;
    }
    
    
    
    
}
