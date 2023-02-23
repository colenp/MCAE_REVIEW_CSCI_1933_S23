public class Rational {
    private int numerator;
    private int denominator;
    
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        int gcd = findGCD(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }
     public String toString() {
        return numerator + "/" + denominator;
    }
    public Rational clone() {
        // No parameters needed for clone() method, as it returns a copy of the current object.
        return new Rational(this.numerator, this.denominator);
    }
    
    public Rational copy(Rational r) {
        // One parameter needed for copy() method, which is the object to be copied.
        return new Rational(r.numerator, r.denominator);
    }
    
    public Rational add(Rational r) {
        // One parameter needed for add() method, which is the rational number to be added.
        int newNumerator = (this.numerator * r.denominator) + (r.numerator * this.denominator);
        int newDenominator = this.denominator * r.denominator;
        return new Rational(newNumerator, newDenominator);
    }
    
    public Rational inverse() {
        // No parameters needed for inverse() method, as it returns the inverse of the current object.
        return new Rational(this.denominator, this.numerator);
    }
    
    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
    
    public static void main(String[] args) {
    // Testing Rational constructor
    Rational r1 = new Rational(2, 3);
    Rational r2 = new Rational(4, 6);
    System.out.println(r1.toString()); // Output: 2/3
    System.out.println(r2.toString()); // Output: 2/3
    
    // Testing clone() method
    Rational r3 = r1.clone();
    System.out.println(r3.toString()); // Output: 2/3
    
    // Testing copy() method
    Rational r4 = new Rational(1, 2);
    Rational r5 = r4.copy(r1);
    System.out.println(r5.toString()); // Output: 2/3
    
    // Testing add() method
    Rational r6 = r1.add(r4);
    System.out.println(r6.toString()); // Output: 7/6
    
    // Testing inverse() method
    Rational r7 = r1.inverse();
    System.out.println(r7.toString()); // Output: 3/2
    }
}