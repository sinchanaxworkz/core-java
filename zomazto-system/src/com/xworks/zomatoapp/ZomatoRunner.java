package com.xworks.zomatoapp;

import com.xworks.zomatoapp.food.Food;
import com.xworks.zomatoapp.zomato.Zomato;

public class ZomatoRunner {
    public static void main(String[] args) {
        Food food = new Food();
        food.hotelName="haridarshan";
        food.foodName="idlivada";
        food.foodPrice=60;
        food.noOfItems=2;

        Zomato zomato = new Zomato(food);
        zomato.orderFood();


    }

}



