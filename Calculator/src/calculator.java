import java.util.Scanner;
public class calculator {
     public static void main(String[] args) {
        	 int operation,number1,number2,result;
        	 double results;
    	 	 Scanner scan=new Scanner(System.in);
    	 	 System.out.println("Enter first number");
    	 number1=scan.nextInt();
    	 System.out.println("Enter second number");
    	 number2=scan.nextInt();

    	 System.out.println("You should choose operation.Press 1 for addition, 2 for subtraction, 3 for multiplication, and 4 for division.");
         operation=scan.nextInt();
         switch(operation) {
         case 1:
        	 result=number1+number2;
        	 System.out.println(number1+"+"+number2+"="+result );
        	 break;
         case 2:
        	 result=number1-number2;
        	 System.out.println(number1+"-"+number2+"="+result );
        	 break;
         case 3:
        	 result=number1*number2;
        	 System.out.println(number1+"*"+number2+"="+result );
        	 break;
         case 4:
        	 results=number1/number2;
        	 System.out.println(number1+"/"+number2+"="+results );
        	 break;
         }
     }
}
