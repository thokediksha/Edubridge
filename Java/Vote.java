import java.util.*;
class Vote{
public static void main(String[] arg){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the age of person");
int n =sc.nextInt();
if(n>=18){
System.out.println("Person is eligible to give vote");
}else{
System.out.println("Person is not eligible to give vote");
}
}
}