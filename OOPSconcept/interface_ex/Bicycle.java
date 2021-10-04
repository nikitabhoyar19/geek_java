package interface_ex;

import interface_ex.*;

public class Bicycle implements Vehicle{

    static int speed;
    static int gear;

    public static void main(String[] args) {
       changeGear(2);
       speedUp(3);
       applyBrakes(1);

       System.out.println("Bicycle present state :");
       printStates();
    }

    public static void changeGear(int newGear) {
       gear = newGear;     
    }

    public static void speedUp(int increment){
          
        speed = speed + increment;
    }
      
    // to decrease speed
    public static void applyBrakes(int decrement){
          
        speed = speed - decrement;
    }
      
    public static void printStates() {
         System.out.println("speed: " + speed
              + " gear: " + gear);
    }
}
