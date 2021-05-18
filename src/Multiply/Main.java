package Multiply;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            Problem problem = new Problem();
            problem.getProblem();

            System.out.print("Answer = ");
            int user_answer = sc.nextInt();

            if(problem.logic(user_answer)){
                System.out.println("Collect!");
            }
            else{
                System.out.println("Game Over. Score: " + problem.getScore());
                break;
            }
            System.out.println();
        }
    }
}
