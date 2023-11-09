 
  import java.util.Scanner;

  public class Gradecalculator {
      public static void main(String args[]) {
          
          float english, physics, math, hindi, chemistry;
          double total, average, percentage;

         try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter marks of english =");
            english = sc.nextFloat();
            System.out.print("Enter marks of physics =");
            physics = sc.nextFloat();
            System.out.print("Enter marks of math =");
            math = sc.nextFloat();
            System.out.print("Enter marks of hindi =");
            hindi = sc.nextFloat();
            System.out.print("Enter marks of chemistry =");
            chemistry = sc.nextFloat();
        }
         total = english + physics + math + hindi + chemistry;
          average = (total / 5.0 );
          percentage = (total / 500.0) * 100;

          System.out.println("Total marks ="+total);
          System.out.println("Average marks ="+average);
          System.out.println("Percentage ="+percentage);        }
    }
    
     
  