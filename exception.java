import java.util.Scanner;

public class exception {
    Scanner sc = new Scanner(System.in);

    public void Division(int num1, int num2) {

        try {
            System.out.println((num1 / num2));
        } catch (ArithmeticException e) {
            System.out.println("You shouldn?t divide a number by zero.");
        }
    }

    public void Array() {
        int lenght;
        int num;
        System.out.print("Enter the size of an array:");
        lenght = sc.nextInt();
        int[] array = new int[lenght];

        for (int i = 0; i < lenght; i++) {
            System.out.print("Enter element no. " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the element no. you want to access: ");
        num = sc.nextInt();
        try {
            System.out.println(array[(num)]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("OOPs!!! Array Index " + num + " out of bounds for length " + lenght);
        }
    }

    public void NullArray() {
        String string=null;
        System.out.println("Enter string for which you want to find length: ");
        string=sc.nextLine();
        if (string.length()==0) {
            string=null;
        }
        try {
            System.out.println(string.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception arises!!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        exception demo = new exception();
        int opt;
        int conti = 1;
        while (conti == 1) {
            System.out.println("MENU: \n1.Divide\n2.Access array element\n3.find length of string");
            System.out.print("Enter Choice :");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.print("Enter the numrator:");
                    int numrator = sc.nextInt();
                    System.out.print("Enter  the Denomenator:");
                    int denomenator = sc.nextInt();
                    demo.Division(numrator, denomenator);
                    break;
                case 2:
                    demo.Array();
                    break;
                case 3:

                    demo.NullArray();
                    break;
                default:
                    System.out.println("Invalid");
                    break;

            }
            System.out.print("Press 1 to continue:");
            conti = sc.nextInt();
        }
    }
}
