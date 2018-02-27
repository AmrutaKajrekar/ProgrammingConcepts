package com.main.hackerrank.interview;

/**
 * @author amruta.kajrekar
 */
class Food {

    String className;
    public void serveFood(){
        System.out.println("I'm serving " + className);
    }
}

class FastFood extends Food{
}

class Fruit extends Food{

}
class FoodFactory extends Food {
    String className;
    public Food getFood(String classN){
        if(className.equalsIgnoreCase("FastFood")){
            Food food = new FastFood();
            food.className = classN;
            return food;
        }
        else if(className.equalsIgnoreCase("Fruit")){
            Food food = new Fruit();
            food.className = classN;
            return food;
        }
        return null;
    }
}
