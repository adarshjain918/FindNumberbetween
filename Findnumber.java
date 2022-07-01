import java.util.Scanner;

public class Findnumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        while(n<1 || n>10) {
            System.out.println(n+ "not Number btween 1 to 10");
            n=sc.nextInt();
        }
        System.out.println(n+" is between 1 &10 ");
    }
}
