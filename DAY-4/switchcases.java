import java.util.Scanner;
class switchcase {
    public static void main(String[] args) {
        System.out.println("enter any choice from 1 to 7");
        Scanner s =new Scanner(System.in) ;
        int i=s.nextInt();
        switch(i) {
            case 1:
                System.out.println("it is sunday");
                break;

            case 2:

                System.out.println("it is monday");
                break;
            case 3:

                System.out.println("it is tuesday");
                break;

            case 4:

                System.out.println("it is wednesday");
                break;

            case 5:

                System.out.println("it is thursday");
                break;
            case 6:

                System.out.println("it is friday");
                break;

            case 7:

                System.out.println("it is saturday");
                break;
            default:
                System.out.println("invalid day number please enter between 1 and 7");
        }
        s.close();
    }

}