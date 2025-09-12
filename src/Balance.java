public class Balance {
    public static void main(String[] args) {
        int a=-124;
        if(a>0) {
            System.out.println("Positive Balance");
        }
        else if(a<0) {
            System.out.println("Overdraft");
        }
        else {
            System.out.println("zero Balance");
        }
    }
}