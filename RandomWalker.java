// YOUR CODE HERE
import java.util.Scanner;
public class RandomWalker
{

  public static void walking(int n)
  {
    int x = 0;
    int y = 0;
    int direction = 0;
    double randomNum = Math.random();
    for (int i = 0; i < n; i++)
    {
      double randomNum = Math.random();
      direction = randomNum*4+1;
      if (direction == 1)
      {
        x++;
      }
      if (direction == 2)
      {
        x--;
      }
      if (direction == 3)
      {
        y++;
      }
      if (direction == 4)
      {
        y--;
      }
    }
    System.out.println("(" + x + "," + y + ")"); 
  }
  
  public static void main (String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("How many steps do you want to take");
    walking(input.nextInt());
    System.out.println("distance: " + (x*x + y*y));
  }
}
