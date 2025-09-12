public class Treasure {
    public static void main(String[] args){
        int a=23;
        int b=9;
        int c=6;
        System.out.println("a="+a + "\tb="+b + "\tc="+c);
        int d;
        if (a>b) {
            d = a;
        }
        else if (b>c){
            d=b;
        }
        else {
            d=c;
        }
        System.out.println("Largest values:"+d);
    }
}