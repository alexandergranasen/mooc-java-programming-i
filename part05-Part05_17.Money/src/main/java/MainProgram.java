
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(1, 0);
        Money b = new Money(2, 0);
        Money firstMinusSecond = a.minus(b);
        
        
        System.out.println(firstMinusSecond.euros());
        
        System.out.println("----");

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.lessThan(b));  // 10.00e

    }
}
