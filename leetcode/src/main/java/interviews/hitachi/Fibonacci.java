package interviews.hitachi;

/**
 * @author amruta.kajrekar on 9/17/18.
 */
public class Fibonacci {
  public static void main(String[] args){
    Fibonacci fibo = new Fibonacci();
    System.out.print(fibo.fibo(15));

  }

  // 0 1, 1

  /**
   * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
   * 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
   * 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811,514229
   * @param n
   * @return
   */
  public long fibo(int n){
    int i=1, pre =0, next = 0;
    System.out.println(0);
    while(i<=n && n>0){
      next =i + pre;
      System.out.println(i);
      pre = i;
      i = next;
    }
    return next;
  }
}

//267914296
