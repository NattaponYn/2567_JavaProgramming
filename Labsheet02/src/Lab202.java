import java.util.Scanner;
public class Lab202 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int previousNumber = Integer.MIN_VALUE; 
        while (true) {
            System.out.print("Input a number: ");
            int currentNumber = scanner.nextInt(); 
            
            
            if (currentNumber < previousNumber) { 
                System.out.println("BYE BYE");
                break; 
            }

}
}
}