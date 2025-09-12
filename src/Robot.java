public class Robot {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        int op=4;
        if (op<=1) {
            System.out.println("a+b="+(a+b));
        }
        else if(op<=2) {
            System.out.println("a-b="+(a-b));
        }
        else if(op<=3) {
            System.out.println("a*b="+(a*b));
        }
        else {
            System.out.println("a/b="+(a/b));
        }
    }
}
