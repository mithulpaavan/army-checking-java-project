import java.util.ArrayList;
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      Hello hello1 = new Hello("paavan",80,177,true);
      Hello hello2 = new Hello("mithul",85,180,true);
      ArrayList<Hello> humans1 = new ArrayList();
        humans1.add(hello1);
        humans1.add(hello2);
      String name = "";
      double height = 0.00;
      double weight = 0.00;
      String spacename = "";
      boolean selected = false;
      //===============entering===============
      while(spacename.isBlank()){
          System.out.println("check whether you are worthy for indian army");
          System.out.println("enter your name: ");
          name = scanner.nextLine();
          System.out.println("enter your height: ");
          height = scanner.nextDouble();
          System.out.println("enter your weight");
          weight = scanner.nextDouble();
          scanner.nextLine();
          spacename = name;
      }
      //==================adding if he got selected===========
      Hello humans = new Hello(name,weight,height,selected);
      System.out.println("thank you for registering");
      humans.isworthforpolice();
      if(humans.selected){ //adds to the selected list if it is true
        humans1.add(humans);
      }
      //======================result=========================
      System.out.println("here are some of the persons who are selected for indian army");
      System.out.println();
      for(Hello i:humans1){
        System.out.println(i.name);
      }
    }
}