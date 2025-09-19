import java.util.Scanner;

public class New {

    public static void main(String[] args) {
        System.out.println("Hello World");
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = input.nextLine();
    System.out.print("enter your age");
    int age = input.nextInt();
    System.out.println("My name is " + name + " and I am " + age + " years old.");
    }


}