package chapte1b5;

public class CountDownApp
{
 public static void main(String[] args)
 {
 Thread clock = new CountDownClock();
 clock.start();
 }
}