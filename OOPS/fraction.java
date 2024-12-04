public class fraction {
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
        // f1.simplify();
        System.out.println("Result: " + f1.numerator+"/"+f1.denominator);
        
    }
    
}
