import java.util.Scanner;
public class LinearEquationLogic {


    public String start(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to the linear equation calculator!");
        System.out.print("Enter coordinate 1: ");
        String coor1= scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coor2=scan.nextLine();
        String xvalc1= coor1.substring(1,coor1.indexOf(","));
        String yvalc1= coor1.substring(coor1.indexOf(",")+2,coor1.length()-1);
        String xvalc2= coor2.substring(1,coor2.indexOf(","));
        String yvalc2= coor2.substring(coor2.indexOf(",")+2,coor2.length()-1);
        LinearEquation first= new LinearEquation(Integer.parseInt(xvalc1),Integer.parseInt(yvalc1),Integer.parseInt(xvalc2),Integer.parseInt(yvalc2));


    }
}
}
