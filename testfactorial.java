public class testfactorial{
    public static void main(String[] args){
        factorial f=new factorial();
        if(fact(5)==120){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failed");
        }
        if(fact(0)==1){
            System.out.println("zero passed");
        }
        else{
            System.out.println("Zero failed");
        }
    }
}