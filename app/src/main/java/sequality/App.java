/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    System.out
        .println(
            "Sum of 2 and 3 is " + new Calculate().sum(2, 3) + ". Average is " + new Calculate().ave(2, 3, 2) + ".");
    System.out
        .println("Sum of 1 to 10 is " + new Calculate().to(1, 10) + ". Average is " + new Calculate().ave(0,
            new Calculate().to(1,
                10),
            10)
            + ".");
    System.out
        .println(
            "Sum of odd of 1 to 10 is " + new Calculate().odd(1, 10) + ". Sum of even is " + new Calculate().even(1, 10)
                + ".");
  }
}
// hoge
