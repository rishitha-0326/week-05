
public class testfactorial {

    public static void main(String[] args) {
        factorial f = new factorial();

        if (f.fact(5) == 120) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        if (f.fact(0) == 1) {
            System.out.println("Zero Test Passed");
        } else {
            System.out.println("Zero Test Failed");
        }
    }
}
