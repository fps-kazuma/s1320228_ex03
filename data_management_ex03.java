import java.util.Random;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    System.out.println("What is your name?");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("> "+ name);
    System.out.println("Hello, "+ name +"!");
    System.out.println("Rolling dice...");
    Random rand = new Random();
    int n1 = rand.nextInt(6)+1;
    int n2 = rand.nextInt(6)+1;
    int total = n1 + n2;

    System.out.println("Die 1 : "+ n1 );
    System.out.println("Die 2 : "+ n2 );
    System.out.println("Total value: "+ total);
  }
}
