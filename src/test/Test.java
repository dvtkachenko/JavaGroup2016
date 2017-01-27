package test;

/**
 * Created by Дима on 26.01.2017.
 */
class King {
    King() {
        System.out.println("Call King constructor");
        speech();
    }
   public void speech() {
       System.out.println("I'm the King of the Andals!");
    }
}
class AerysTargaryen extends King {
       private String victimName;
   AerysTargaryen() {
      System.out.println("Call AerysTargaryen constructor");
      victimName = "Lyanna Stark";
      speech();
   }
      @Override
   public void speech() {
       System.out.println("Burn " + victimName + "!");
   }
}
public class Test {
   public static void main(String[] args) {
       King king = new AerysTargaryen();
   }
}