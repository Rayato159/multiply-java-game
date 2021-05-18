//Multiply-Java-Game
//CreateBy Ruangyot Nanchiang

package Multiply;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("CreateBy Ruangyot Nanchiang\n");
        while(true) {
            Problem problem = new Problem();
            problem.getProblem();

            try {
                Scanner sc = new Scanner(System.in);
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

            catch(Exception e) {
                System.out.println("Error! Please enter integer number.\n");
            }

        }
    }
}
