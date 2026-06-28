class Calculator {
    public int add(int n1 , int n2, int n3) {
        
        return n1 + n2 + n3;
    }

    public double add(int n1, int n2) 
    {
        return n1 + n2;
    }
}
public class Methods2 {
    public static void main(String[] args) {

        Calculator obj = new Calculator();
        double r1 = obj.add(3, 4);
        System.out.println(r1);
        
    }
}
