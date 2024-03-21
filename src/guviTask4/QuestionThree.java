package guviTask4;
import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        String days[]=new String[7];
        Scanner mps=new Scanner(System.in);
        //trying to store the array elements
        for(int i=0;i<days.length;i++)
        {
            System.out.println("Enter day "+(i+1));
            days[i]=mps
            		.nextLine();
        }
        for(int i=0;i<=days.length;i++)//Intentionally i<=days.length inorder to handle the error
        {
            try{
                System.out.println(days[i]);
            }catch(Exception e){
                System.out.println("The seven days of the week is printed");
                System.out.println("The error:"+e);
            }
            
        }
    }
    
}
