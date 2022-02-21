import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // 1. Create your Scanner object to get input from the keyboard.

	Scanner sc = new Scanner(System.in);

    // 2. Create a statement that ask the user their name. Create a variable that holds the users input from the keyboard. 

System.out.println("Hello please tell me your name?");

String line =sc.nextLine();


    // 3. Make a print statement that returns "Hello Leo, it is nice to meet you.
  System.out.println("Hello Leo, it is nice to meet you.");

    // 4. Create another Statement that ask the user where they live and create a variable that takes in the state you want your user to live in.



	System.out.println("What state do you live in?");
  String line1 = sc.nextLine();



    // 5. Create a print statement that ask how old user is. And get Answer from keyboard.
	System.out.println("How old are you?" );

  String line2 = sc.nextLine();

   // 6. Close your Scanner object. 

	sc.close();





	

	

   
   // 7. Finish by combining your user inputs to one print statement.
 	 System.out.println(line + ", I am also " + line2 + " and hear that " + line1 + " is beautiful!"); 


	    } 

}
