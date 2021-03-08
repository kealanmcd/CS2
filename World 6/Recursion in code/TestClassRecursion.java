public class TestClassRecursion 
{
  // Question 1 - Implement the double factorial function.
  public static double doubleFactorial(double n)
  {
      if (n <= 2) { return n; }
      return n * doubleFactorial(n - 2);
  }

  // Question 2 - Implement a function which computes the n-th Fibonacci number.
  public static int fibonnaciNumber(int n)
  {
      if (n < 2) { return n; }
      return fibonnaciNumber(n - 1) + fibonnaciNumber(n - 2);
  }


  public static void main(String[] args)
  {
      System.out.println("Question 1 - Double factorial");
      System.out.println(doubleFactorial(4));
      System.out.println(doubleFactorial(5));
      System.out.println(doubleFactorial(6));
      System.out.println(doubleFactorial(22));


      System.out.println("\nQuestion 2 - n-th Fibonacci number");
      System.out.println(fibonnaciNumber(1));
      System.out.println(fibonnaciNumber(2));
      System.out.println(fibonnaciNumber(3));
      System.out.println(fibonnaciNumber(4));
      System.out.println(fibonnaciNumber(5));
      System.out.println(fibonnaciNumber(6));
      System.out.println(fibonnaciNumber(7));
      System.out.println(fibonnaciNumber(8));
      System.out.println(fibonnaciNumber(9));
      System.out.println(fibonnaciNumber(10));
      System.out.println(fibonnaciNumber(11));
      System.out.println(fibonnaciNumber(12));
      System.out.println(fibonnaciNumber(13));
      System.out.println(fibonnaciNumber(14));

  }
}
