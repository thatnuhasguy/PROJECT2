public class LinearEquationRunner {
    public static void main(String[] args) {
        LinearEquation eq1= new LinearEquation(5,7,5,-3);
        System.out.println(eq1.equation());
        System.out.println(eq1.yIntercept());
        System.out.println(eq1.slope());
        System.out.println(eq1.distance());
    }
}
