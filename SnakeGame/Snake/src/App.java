import javax.swing.*;
 
public class App {     
    public static void main(String[] args) throws Exception {
      int boardWidth = 600;
      int boardHeight = boardWidth;
       

      JFrame frame = new JFrame("Snake");
      frame.setVisible(true);
      frame.setSize(boardWidth, boardHeight);
      frame.setLocationRelativeTo(null);//sets to open up the window at the center of the screen
      frame.setResizable(false);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//makes the program to be terminated when the user clicks on the x on the window 

      SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
      frame.add(snakeGame);
      frame.pack();//places the jpanel inside the frame with the full dimensions because the snake bar title does not make the panel 600px exactly
      snakeGame.requestFocus(); 
    }
}
