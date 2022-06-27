package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(int x, int y, int num) {
    return (x + y) / num;
  }

  public int to(int x, int y) {
    int tmp = 0;
    for (int i = x; i <= y; i++) {
      tmp += i;
    }
    return tmp;
  }

  public int odd(int x, int y) {
    int tmp = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 1) {
        tmp += i;
      }
    }
    return tmp;
  }

  public int even(int x, int y) {
    int tmp = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        tmp += i;
      }
    }
    return tmp;
  }

}
