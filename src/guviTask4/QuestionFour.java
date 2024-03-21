package guviTask4;
import java.util.HashMap;
import java.util.Scanner;

class Student{
    private String name;
    private Integer marks;
    private HashMap<String ,Integer> reportCards;

    public Student(){
        reportCards=new HashMap<>();
    }
    public void addRecord(String name,Integer marks){
        System.out.println("Adding record");
        reportCards.put(name,marks);
    }
    public void deleteRecord(String name){
        reportCards.remove(name);
    }
    public void displayMarksByName(String name){
        System.out.println(reportCards.get(name));
    }
    public void display(){
        System.out.println(reportCards);
    }
}





public class QuestionFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        
        for(int i=0;i<3;i++){
            System.out.println("Enter the name of student "+(i+1));
            String name=sc.nextLine();
            System.out.println("Enter the marks of student "+(i+1));
            Integer marks=sc.nextInt();
            sc.nextLine();
            s.addRecord(name, marks);
        }
       
        System.out.println("Enter the name of student to be deleted:");
        String name=sc.nextLine();
        s.deleteRecord(name);
       
        
        s.display();

        
        System.out.println("Enter the name of student whose marks need to be displayed");
        name=sc.nextLine();
        s.displayMarksByName(name);
        

        
    }
    
}

