package com.using.hashset;
import com.using.hashset.model.Customer;
import com.using.hashset.model.DeliveryAgent;
import com.using.hashset.model.Order;
import com.using.hashset.model.Restaurant;
import com.using.hashset.service.CustomerService;
import com.using.hashset.service.DeliveryAgentService;
import com.using.hashset.service.OrderService;
import com.using.hashset.service.RestaurantService;

import java.util.Scanner;
public class BookingOrderManagement {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int option = 0;
        do {
            System.out.println("-----------Booking Management-----------");
            System.out.println("Please choose the option");
            System.out.println("1. Create customer");
            System.out.println("2. Create delivery agent");
            System.out.println("3. Create restaurant ");
            System.out.println("4. Create order");
            System.out.println("0. Exit project");
            System.out.println("Select the option..");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    CustomerService customerService = new CustomerService();
                    customerService.createCustomer();
                    Customer customer = new Customer();
                    customerService.displayCustomers();
                    System.out.println("Customer created : " + customer);
                    break;
            }
            switch (option) {
                case 2:
                    DeliveryAgentService deliveryAgentService = new DeliveryAgentService();
                    deliveryAgentService.createDeliveryAgent();
                    DeliveryAgent deliveryAgent = new DeliveryAgent();
                    deliveryAgentService.displayDeliveryAgent();
                    deliveryAgentService.createDeliveryAgent();
                    //System.out.println("DeliveryAgent created : " + deliveryAgent);
                    break;
            }
            switch (option) {
                case 3:
                    OrderService orderService = new OrderService();
                    orderService.createOrder();
                    Order order = new Order();
                    orderService.displayCustomers();
                    orderService.createOrder();
                    System.out.println("Order created : " + order);
                    break;
            }
            switch (option) {
                case 4:
                    RestaurantService restaurantService = new RestaurantService();
                    restaurantService.createRestaurant();
                    Restaurant restaurant = new Restaurant();
                    restaurantService.displayRestaurant();
                    restaurantService.createRestaurant();
                    System.out.println("Restaurant created : " + restaurant);
                    break;
            }
        } while (option != 0);

        System.out.println("THANK YOU!");
    }
}


