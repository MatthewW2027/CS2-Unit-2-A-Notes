public class Main {

   public static void main(String []args) {
      
      // BOOLEAN VARIABLES can only hold true or false 
      boolean lightsOn = false; 
      boolean dannyPresent = true; 

      // BOOLEAN EXPRESSIONS are like questions where the only possible answers are true or false 
      boolean expl = (dannyPresent == true); // is Danny here? 
      boolean exp2 = (lightsOn != true); // are the lights NOT on? (off)

      // Comparing numerical values 
      int x = 6; 
      int y = 7; 

      // Check for EQUALITY using the == operator 
      System.out.println(x == y); // you can print boolean exp. directly 
      // Check for NOT equal the != operator 
      boolean exp3 = (x != y); // store the boolean exp result in a variable 
      System.out.println(exp3); 

      // Compare numeric values (int, double) using RELATIONAL OPERATORS 
      System.out.println(x < y); // true (6 is LESS THAN 7)
      System.out.println(x > y); // false
      System.out.println(x <= y); // true 
      System.out.println(x >= y); // false 
      System.out.println(y >= x); // true (ORDER MATTER with relational operators)
      System.out.println(y == x);

      // Can you compare ints and doubles 
      double z = 6.0; 
      System.out.println(x == z); // ture (6 and 6.0 are the same value!)
      
      // IF STATEMENTS: use boolean expressions to make DECISIONS about which code to execute 
      double time = 8.5; // means 8:30 AM 
      time = 7.75; // means 7:45 AM 
      time = 8.25; // means 8:15 AM 
      // Two way SELECTION: if block plus + else block
      time = 8.0;
      if (time < 8) {
         System.out.println("Eligible for elevator!"); 
      }
      else {
         // Statement in ELSE block runs when IF block is false 
         System.out.println("Take the stairs..."); 
      }

      // Another example of TWO-WAY SELECTION 
      // in this case, using just a boolean VALUE (not an EXPRESSION) 
      boolean heads = false; // flipped tails  
      // if (true)
      if (heads == true) {
         System.out.println("Flipped Heads! Wear White."); 
      }
      else {
         System.out.println("Flipped tails! Wear black.");
      }

      // MULTI-WAY SELECTION 
      // 1. NESTING if statments is like asking "follow-up questions"
      int age = 16; 
      boolean havePermit = true; 
      System.out.println("Let's see if you can take this road test...");
      if (age >= 16) {
         System.out.println("Alright, I guess you're old enough...");
         // After passing the first condition (age >= 16) you ask a FOLLOWUP (another if statement)

         if (havePermit == true) {
            System.out.println("Fine, get in the car."); 
         }
      } 
      else {
         System.out.println("You're too young. "); 
      }

      // 2. ELSE IF BLOCKS (chained conditionals) when you are accounting for multiple possible answers 
      int battery = 15; 
      // Always start the block with an IF statement 
      if (battery >= 95) {
         System.out.println("Unplug your phone!"); 
      }
      // ORDER MATTERS for else if blocks
      // as soon as a condition is met, the rest of the chian is skipped 
      else if (battery < 20) {
         System.out.println("LOW POWER MODE"); 
      }
      else if (battery <= 50) {
         System.out.println("Plug in your phone soon..."); 
      }
      else {
         System.out.println("🪫"); 
      }

       // COMPOUND BOOLEAN EXPRESSIONS 
      // to test TWO conditions in an if statement 
      boolean cleanedRoom = true; 
      boolean didHomework = false; 
      // The AND (&&) operator joins two expressions 
      // only comes out to TRUE if BOTH ARE TRUE!
      if ((cleanedRoom == true) && (didHomework == true)) {
         System.out.println("Go have fun!"); 
      }
      else {
         System.out.println("nuh uh"); 
      }

      // The OR (||) operator joins two expressions 
      // comes out to TRUE if AT LEAST ONE is TRUE! 
      // (less restricitive condition than AND) 
      if ((cleanedRoom == true) || (didHomework == true)) {
         System.out.println("The less strict parents are fine with you going out!"); 
      }

      // The NOT (!) operator can be used to NEGATE 
      // a boolean expression 
      if (! (didHomework == true)) {
         System.out.println("Do your CodeCollab! The class is depending on you!"); 
      }
      // REMINDER: boolean VARIABLES can be used 
      // instead of full EXPRESSIONS (with relational operators)
      if (!didHomework) {
         System.out.println("You did not do your homework!"); 
      }

      // IMPORTANT NOTE ABOUT STRINGS: 
      // (and other object data types)
      // You can't use the == operator to CHECK EQUALITY instead, use a String Method called .equals() 
      String course = "AP Computer Science"; 
      if (course.equals("AP Computer Science")) {
         System.out.println("Time to learn JAVA!"); 
      }
      // .equals is CASE-SENSITIVE 
      // it checks every single character in order between the 2 Strings 

      String message1 = "Hello World"; 
      String message2 = "Hello World"; 
      if (message1.equals(message2)) {
         System.out.println("The messages match perfectly!"); 
      }
      // You can mix String VARIABLES with String LITERALS 
      // ex) both are String LITERALS below 
      if ("hi".equals("hi")) {
         System.out.println("hi"); 
      }

   } // this closes the main METHOD 
} // this closes the Main CLASS
