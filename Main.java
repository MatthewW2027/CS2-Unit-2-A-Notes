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

   }
}
