import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner fb= new Scanner(System.in);
    System.out.println("who is this:");
    String Name= fb.nextLine();
    System.out.print("Verification of name: " + Name);
    
    Scanner fbb= new Scanner(System.in);
    //System.out.println(":");
    int Age= fbb.nextInt();
    System.out.println( "Verification of age: " + Age);
    if (Age >=25) { System.out.println("Eligible for truck driving");
    }
    else { System.out.println("Not eligible for driving");
}
}
}
