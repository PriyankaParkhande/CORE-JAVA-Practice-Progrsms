import java.util.*;

public class BallExtractionApplication {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BallExtraction be = new BallExtraction();
        do {
            Scanner xyz = new Scanner(System.in);
            int choice;
            System.out.println("1:Add Ball in Bag");
            System.out.println("2:View All Balls in bag");
            System.out.println("3:Extract the ball from bag");
            System.out.println("enter your choice");
            choice = xyz.nextInt();
            switch (choice) {
                case 1:
                    Ball ball = new Ball();
                    xyz.nextLine();
                    System.out.println("enter the ball color");
                    String colorName = xyz.nextLine();
                    System.out.println("enter the ball company");
                    String compName = xyz.nextLine();
                    System.out.println("Enter the ball weight");
                    int weight = xyz.nextInt();
                    System.out.println("Enter the ball size");
                    int size = xyz.nextInt();
                    ball.setColor(colorName);
                    ball.setCompany(compName);
                    ball.setWeight(weight);
                    ball.setSize(size);

                    be.addBall(ball);
                    break;
                case 2:
                    be.viewAllBalls();
                    break;
                case 3:
                    be.pickUpBall();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while (true);
    }
}