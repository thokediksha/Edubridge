import java.util.*;
class Salary{
public static void main(String[] arg){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the salary:");
   int n = sc.nextInt();
   int bonus;
   int update;
if(n>20000){
bonus=float(0.10*20000);
update = bonus + n;
System.out.println("Incremented Salary with 10% bonus" + update);
}else{
System.out.println("Salary is not grater than 20000");
}
}
}


