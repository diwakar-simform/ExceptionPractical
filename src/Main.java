/*
Exception - Practical
- Create main class which contain try statement which generated divide by 0 zero.

- There should be two catch block for arithmetic exception  and second with catch generic exception with Exception class.

- Divide by zero should catch by arithmetic exception.

- Add finally block which should be executed with or without error.

- On each block put some print message on console.
 */

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("---Inside try block---");
            int a = 10/0;
        }catch (ArithmeticException ae) {
            System.out.print("---Inside Catch Block : ");
            System.out.println("ArithmenticException caught : "+ae.getMessage());
        }catch (Exception e) {
            System.out.println("Exception caught by : "+e.getMessage());
        }finally {
            System.out.println("---Inside finally block---");
        }
    }
}

