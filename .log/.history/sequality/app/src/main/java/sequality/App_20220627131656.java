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
    System.out.println("Sum of 2 and 3 is " + new Calculate().sum(2, 3) + ". Average is " + new Calculate().ave(2, 3));
    System.out
        .println("Sum of 1 and 10 is " + new Calculate().sum(1, 10) + ". Average is " + new Calculate().ave(1, 10));
  }
}
// hoge
