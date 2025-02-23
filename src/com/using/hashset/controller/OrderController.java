package com.using.hashset.controller;

import com.using.hashset.exception.CustomerException;
import com.using.hashset.model.Customer;
import com.using.hashset.model.Order;
import com.using.hashset.service.DeliveryAgentService;
import com.using.hashset.service.OrderService;

import java.util.Scanner;

public class OrderController {

    private OrderService orderService = new OrderService();
    private Customer C = new Customer();
    private Scanner sc = new Scanner(System.in);

    public void orderInfo() {
        int option;
        do{
            System.out.println("\n---- Order ----");
            System.out.println("1. Add Order");
            System.out.println("2. View Order Details");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter choice: ");

            option = Integer.parseInt(sc.nextLine());
            try {
                switch (option) {
                    case 1:
                        orderService.createOrder();
                        Order order = new Order();
                        orderService.displayOrder();
                        System.out.print("Order " + order);
                        break;
                    case 2:
                        orderService.createOrder();
                        break;
                    case 0:
                        System.out.println("Returning to Main Menu...");
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (CustomerException e) {
                System.out.println("Error: " + e.getClass());
            }
        } while (option != 0);
    }
}

