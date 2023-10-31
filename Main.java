import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Q1
        Scanner s = new Scanner(System.in);
//        System.out.println("Input a number :");
//        int input = s.nextInt();
//        if(input%2==0){
//            System.out.println("the number is even");
//
//        }else System.out.println("the number is odd");


        //Q2

        System.out.println("enter a number or f to stop");
        String num =s.nextLine();
        int sum=0;
        while (num.equals("f")==false){
           int x = Integer.parseInt(num);
            sum = sum+x;
            System.out.println("enter a number or f to stop");
            num =s.nextLine();

        }
        System.out.println("the sum is: "+sum);



        //Q3

        int [] arr = {10,-21,30,31,-25};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                System.out.println(arr[i]+" is a positive number");
            }else System.out.println(arr[i]+" is a negative number");

        }


        //Q4

        String [] str = {"Tuwaiq","Bootcamp","Student","JAVA"};
        String small="";
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length ; j++) {
                if(str[i].length()>str[j].length()){
                    small =str[j];
                }
            }
        }
        System.out.println(small);


    }
}