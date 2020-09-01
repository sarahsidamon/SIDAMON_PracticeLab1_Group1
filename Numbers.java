import java.util.Scanner;

public class Numbers {

public static void main (String[] args) {
    
    int add1, add2, sum;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Number: ");
    add1 = sc.nextInt();
    
    System.out.println("Enter Second Number: ");
    add2 = sc.nextInt();
    
    sc.close();
    sum = add1 + add2;
    System.out.println("Sum of these numbers: "+sum);
}
}
