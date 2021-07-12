import java.util.*;
class Swap{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number:");
int x =sc.nextInt();
System.out.println("Enter Second No:");
int y =sc.nextInt();
int temp;
 temp = x;
 x = y;
 y = temp;
System.out.println("After swapping the no:" + (x)+","+(y));
}
}