import java.util.Scanner;
public class LinearEquationLogic {
    private Scanner scan;
    public LinearEquationLogic() {
        scan = new Scanner(System.in);
    }
    private void welcomeUser(){
        System.out.println("--Welcome to the linear equation calculator!--");
    }

    public void start(){
        welcomeUser();
        System.out.print("Enter coordinate 1: ");
        String coor1= scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coor2=scan.nextLine();
        String xvalc1= coor1.substring(1,coor1.indexOf(","));
        String yvalc1= coor1.substring(coor1.indexOf(",")+2,coor1.length()-1);
        String xvalc2= coor2.substring(1,coor2.indexOf(","));
        String yvalc2= coor2.substring(coor2.indexOf(",")+2,coor2.length()-1);
        LinearEquation first= new LinearEquation(Integer.parseInt(xvalc1),Integer.parseInt(yvalc1),Integer.parseInt(xvalc2),Integer.parseInt(yvalc2));
        System.out.println("\n"+first.lineInfo()+"\n");
        if (Integer.parseInt(xvalc2)-Integer.parseInt(xvalc1) != 0) {
            System.out.print("Enter a value for x: ");
             double XVal= scan.nextDouble();
            scan.nextLine();
            System.out.println("\nThe point on the line is "+first.coordinateForX(XVal)+"\n");
        }
        System.out.print("Would you like to enter another pair of coordinates? y/n: ");
        String answer=scan.nextLine();
        while (answer.equals("y")){
            System.out.print("Enter coordinate 1: ");
            coor1= scan.nextLine();
            System.out.print("Enter coordinate 2: ");
            coor2=scan.nextLine();
            xvalc1= coor1.substring(1,coor1.indexOf(","));
            yvalc1= coor1.substring(coor1.indexOf(",")+2,coor1.length()-1);
            xvalc2= coor2.substring(1,coor2.indexOf(","));
            yvalc2= coor2.substring(coor2.indexOf(",")+2,coor2.length()-1);
            LinearEquation second = new LinearEquation(Integer.parseInt(xvalc1),Integer.parseInt(yvalc1),Integer.parseInt(xvalc2),Integer.parseInt(yvalc2));
            System.out.println("\n"+second.lineInfo());
            if (Integer.parseInt(xvalc2)-Integer.parseInt(xvalc1) != 0) {
                System.out.print("\nEnter a value for x: ");
                double firstXVal= scan.nextDouble();
                scan.nextLine();
                System.out.println("\nThe point on the line is "+second.coordinateForX(firstXVal));
            }
            System.out.print("\nWould you like to enter another pair of coordinates? y/n: ");
            answer=scan.nextLine();
        }
        System.out.println("Thank you for using the slope calculator, goodbye!");
    }


}

