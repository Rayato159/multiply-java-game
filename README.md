# Multiply-Java-Game
CreateBy@ Ruangyot Nanchiang  

## Description  
This game is a basic mathematics. The program will random a problems and you need to fill the right answer.

## Logic Code

```Java
if(problem.logic(user_answer)){
      System.out.println("Collect!");
  }
else{
      System.out.println("Game Over. Score: " + problem.getScore());
      break;
  }
```
If user answer is correct score will +1. But if user answer is incorrect game will be over and stop the game.
