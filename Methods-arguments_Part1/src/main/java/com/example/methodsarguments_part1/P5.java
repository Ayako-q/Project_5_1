package com.example.methodsarguments_part1;
import java.util.Scanner;
//project 5 part 1 by Oleksii Ishchenko
public class P5 {
    //void - method without return value
    public static void main(String[] args){
        while(PlayAgain() == true){
            CountLoan();
        }
    }
    public static boolean CountLoan(){
        System.out.println("What amount of money $ do you want to borrow?");
        double Amount = GetUserInt();
        System.out.println("What is payback length (in months)?");
        double Period = GetUserInt();
        System.out.println("What is interest rate?");
        double inrate = GetUserInt();
        double PerMonth = (Amount+Amount/100*inrate)/Period;
        System.out.println("You'll need to pay "+PerMonth+"$ per month");
        return false;}
    public static double GetUserInt(){
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        return number;}
    //PlayAgain method asks user if he want to play
    public static boolean PlayAgain(){
        System.out.println("Hi, I am loan counter! Type 1 if " +
                "you want to play or start over or anything else to exit");
        double Answer = GetUserInt();
        if (Answer == 1){
            System.out.println("Ok, then lets continue");
            return true;}
        System.out.println("Ok, then bye!");
        return false;}
}
