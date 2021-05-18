package Multiply;

import java.util.Random;

public class Problem {
    Random rand = new Random();
    private int a = rand.nextInt(100);
    private int b = rand.nextInt(100);
    private int answer = a * b;
    private static int score;

    public void getProblem(){
        System.out.println(a + " x " + b + " = " + "?");
    }

    public int getAnswer() {
        return answer;
    }

    public boolean logic(int user_answer){
        if (user_answer == answer) {
            score += 1;
            return true;
        }
        else {
            return false;
        }
    }

    public int getScore() {
        return score;
    }
}
