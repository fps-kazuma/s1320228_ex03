import java.util.Random;
class Dice{
  public static void main(String[] args){
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
