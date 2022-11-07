import java.util.Scanner;

public class Inputan{
    
    private Scanner input;
    
    public Inputan(){
        input = new Scanner(System.in);
    }
    
    public int getInput(){
        return input.nextInt();
    }
}