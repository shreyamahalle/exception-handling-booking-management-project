package com.using.hashset.service;

import com.using.hashset.model.Restaurant;

import java.util.*;

public class RestaurantService {
    private static HashMap<Integer,Restaurant> restaurants = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    void printCustomer(Restaurant r){

        System.out.println(r);
    }
    public static void createRestaurant(){

            Restaurant r = new Restaurant();

            try {

            System.out.println("Please enter registerNo");
            int registerNo = Integer.parseInt(sc.nextLine());

            System.out.println("Please enter name");
            String name = sc.nextLine();

            System.out.println("Please enter city");
            String city = sc.nextLine();

            System.out.println("Please enter area");
            String area = sc.nextLine();

            r.setRegisterNo(registerNo);
            r.setName(name);
            r.setCity(city);
            r.setArea(area);
            restaurants.put(1,r);
            }catch (Exception e){
                System.out.println("Invalid input type correct data");
            }
    }
    public static void displayRestaurant(){
        try {
            Set<Map.Entry<Integer, Restaurant>> entrySet = restaurants.entrySet();
            for (Map.Entry<Integer, Restaurant> customerEntry : entrySet) {
                System.out.println("Customer Info: " + restaurants);
            }
        }catch (Exception e){
            System.out.println("Invalid input type correct data");
        }
    }
}