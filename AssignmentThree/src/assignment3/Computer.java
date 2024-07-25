package assignment3;

public class Computer extends Keyboard implements Button{

    public void tapButton(char button){
        System.out.print(button);
    }

    public void holdButton(int duration, char button){
        for(int i = 0; i < duration; i++){
            System.out.print(button);
        }
    }
}
