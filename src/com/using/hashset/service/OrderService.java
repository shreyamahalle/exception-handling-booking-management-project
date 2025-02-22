package com.using.hashset.service;
import com.using.hashset.model.DeliveryAgent;
import com.using.hashset.model.Order;

import java.util.*;

public class OrderService {

    private HashMap<Integer,Order> orders = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    void printCustomer(Order o){

        System.out.println(o);
    }
    public Order createOrder(){
            Order o = new Order();
            try {
                System.out.println("Please enter id");
                int id = Integer.parseInt(sc.nextLine());

                System.out.println("Please enter type");
                String type = sc.nextLine();

                System.out.println("Please enter note");
                String note = sc.nextLine();

                System.out.println("Please enter paymentMethod");
                String paymentMethod = sc.nextLine();


                o.setId(id);
                o.setPaymentMethod(paymentMethod);
                o.setNote(note);
                o.setType(type);
                orders.put(1, o);
            }catch (Exception e){
                System.out.println("Invalid input type correct data");
            }
            return o;
        }
    public void displayCustomers(){
        try {
            Set<Map.Entry<Integer, Order>> entrySet = orders.entrySet();
            for (Map.Entry<Integer, Order> customerEntry : entrySet) {
                System.out.println("Customer Info: " + orders);
            }
        }catch (Exception e){
            System.out.println("Invalid input type correct data");
        }
    }
}