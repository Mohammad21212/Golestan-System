package ir.ac.kntu;

import java.util.ArrayList;
import java.util.HashMap;

public class Food {
    private int price;
    private FoodType foodType;
    private TimeTable time;
    private String name;
    private

    enum lunch {
        MainFood, Salad, Beverage
    }
    enum MainFood {

    }
    enum breakFast {
        Eggs, Cheese, Butter, Honey, Jam
    }

    enum place {
        SchoolCanteen, Dorm
    }

    enum FoodType {
        BreakFast, Lunch, Dinner
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public TimeTable getTime() {
        return time;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTime(TimeTable time) {
        this.time = time;
    }
}
