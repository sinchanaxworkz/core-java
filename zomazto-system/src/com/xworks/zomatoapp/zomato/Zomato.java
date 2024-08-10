package com.xworks.zomatoapp.zomato;

import com.xworks.zomatoapp.food.Food;

public class Zomato {
    Food food;
    public Zomato(Food food){
        this.food=food;


    }
    public void orderFood(){
        if(food!=null)
            this.food.foodDisplayInfo();
        else
            System.out.println("food not fond");



    }






}
