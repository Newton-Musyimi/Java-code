public class Rational
{
    private int numerator = 0;
    private int denominator = 0;  //danger

    public Rational ()
    {
        this.numerator = 0;
        this.denominator = 0; //danger
    }

    public Rational (int x, int y)
    {
        this.numerator = x;
        this.denominator = y; //danger
    }

    public String toString()
    {
        simplify();
        return String.format("%d/%d", this.numerator, this.denominator);
    }

    public void add (Rational x, Rational y)
    {
        this.numerator = x.numerator*y.denominator + y.numerator*x.denominator;
        this.denominator = x.denominator*y.denominator;
    }

    public void sub (Rational x, Rational y)
    {
        this.numerator = x.numerator*y.denominator - y.numerator*x.denominator;
        this.denominator = x.denominator*y.denominator;
    }

    public void mul (Rational x, Rational y)
    {
        this.numerator = x.numerator*y.numerator;
        this.denominator = x.denominator*y.denominator;
    }

    public void div (Rational x, Rational y)
    {
        this.numerator = x.numerator*y.denominator;
        this.denominator = x.denominator*y.numerator;
    }

    public void update (int n, int d)
    {
        // this method should update the value of the instance calling it
        int gcd;
        gcd = gcd(n, d);

        n = n / gcd;
        d = d / gcd;
        this.numerator = n;
        this.denominator = d; //danger
    }

    public int getNumerator ()
    {
        // this method should return the numerator
        return this.numerator;
    }

    public int getDenominator ()
    {
        // this method should return the denominator
        return this.denominator;
    }

    public boolean equals (Rational x)
    {
        // this method should return true if the instance calling it is equal to x
        //if (this.numerator!=x.numerator && this.denominator!=x.denominator) {
        if (this!=x) {
            return false;
        }
        return true;
    }

    public int compare (Rational x)
    {
        // this method should return:
        //      a negative number if the instance calling it is less than x
        //      zero if the instance calling it is equal to x
        //      a positive number if the instance calling it is greater than x

        return 0;
    }

    private int gcd(int x, int y)
    {
        if (y == 0)
        {
            return x;
        }
        else
        {
            return gcd(y, x % y);
        }
    }

    private void simplify()
    {
        int g = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator/g;
        this.denominator = this.denominator/g;
    }


}
