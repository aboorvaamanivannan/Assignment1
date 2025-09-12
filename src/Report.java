public class Report {
    public static void main(String[] args) {
        int mark=60;
        if (mark>=90) {
            System.out.println("A");
        }
        else if (mark>=75 && mark<90) {
            System.out.println("B");
        }
        else if (mark>=50 && mark<75) {
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }
    }
}