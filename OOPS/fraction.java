public class fraction {
    public static Fraction add(Fraction f1, Fraction f2){
        int num = f1.numerator*f2.denominator+f2.numerator*f2.denominator;
        int den = f1.denominator*f2.denominator;
        Fraction f3 = new Fraction(num, den);
        return f3;    
    }
    public static int gcd(int num, int den){
        int min = Math.min(num, den);
        for(int i = min; i >= 1; i--){
            if(num%i==0 && den%i==0) return i;
        }
        return min;
    }
    public static class Fraction {
        int numerator;
        int denominator;

        public Fraction(int num, int den){
            numerator = num;
            denominator = den;
            simplify();
        }
        public void simplify(){
            int hcf = gcd(numerator, denominator);
            numerator /= hcf;
            denominator /= hcf;
        }
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 18);
        System.out.println("Result: " + f1.numerator+"/"+f1.denominator);
        // // f1.simplify();
        // System.out.println("Result: " + f1.numerator+"/"+f1.denominator);
        Fraction f2 = new Fraction(7, 3);
        System.out.println(f2.numerator+"/"+f2.denominator);
        Fraction f3 = add(f1, f2);
        System.out.println(f3.numerator+"/"+f3.denominator);
        
    }
    
}
