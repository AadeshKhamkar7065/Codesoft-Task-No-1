//Task - 1

import java.util.*;
public class Number_Game{
    public static void main(String[] args) {
        System.out.println("Enter your choice");
        System.out.println();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int num = (int)(Math.random()*100);
        int user = 0;
        do{
            System.out.println("Guess the number");
            user = sc.nextInt();
            if(num == user) {
                System.out.println("Wow its a correct");
                break;
            }
            else if(num < user){
                System.out.println("NO Its to large yaar");
            }
            else{
                System.out.println("NO.... Its to Small yaar");
            }
        }while(user>=0);
        System.out.println("Okay this is number");
        System.out.println(num);
    }
}