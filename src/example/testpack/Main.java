package example.testpack;

import com.brainacad.carpack.Car;
import example.applepack.Apple;

/**
 * Created by Дима on 25.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setWeight(0.25);
        Car car = new Car();
        car.setWeight(1256);

        System.out.println("The apple's weight is " + apple.getWeight());
        System.out.println("The car's weight is " + car.getWeight());
    }
}
