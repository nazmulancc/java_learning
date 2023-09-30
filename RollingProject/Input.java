import java.util.Scanner;

public class Input {

	//default constructor
    public Input(){

    }

    public char acceptCharInput(String displayMessage, int position){
        Scanner console = new Scanner(System.in);
        System.out.println(displayMessage);
        String input = console.nextLine().trim();
        return input.charAt(position);
     //   return (acceptStringInput(displayMessage).trim().charAt(position));
    }
    public double acceptDoubleInput(String displayMessage){
      /*  Scanner console = new Scanner(System.in);
        System.out.println(displayMessage);
        double input = console.nextDouble();
        return input;
      //  return Double.parseDouble(console.nextLine());
       */

        return Double.parseDouble(acceptStringInput(displayMessage));
    }

    public int acceptIntInput(String displayMessage){
        Scanner console = new Scanner(System.in);
        System.out.println(displayMessage);
        int input = Integer.parseInt(console.nextLine());
        return input;
    }

//    public int acceptIntInput(String displayMessage){
//        return Integer.parseInt(acceptStringInput(displayMessage));
//    }

    public String acceptStringInput(String displayMessage){
        Scanner console = new Scanner(System.in);
        System.out.println(displayMessage);
        //return input
        return console.nextLine();
    }
}

