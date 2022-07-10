public class Hello{
    String name;
    double weight;
    double height;
    boolean selected;
    Hello(String name, double weight, double height, boolean selected){
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.selected = selected;
    }
    void isworthforpolice(){
        if(this.weight>=80 && this.weight<=95 && this.height>=175 && this.height<=190){
            System.out.println(this.name+" congratulations");
            System.out.println("you are selected for the indian army");
            this.selected = true;
        }
        else{
            System.out.println("sorry my friend you didnt get selected better luck next time");
            this.selected = false;
        }
    }
}