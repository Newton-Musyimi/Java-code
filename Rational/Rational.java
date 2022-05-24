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

    public String toString()//do
    {
        int num;
        simplify();
        if(this.numerator==this.denominator){
            return "1";
        }
        if(this.denominator==1){
            return String.format("%d",this.numerator);
        }
        if(this.numerator>this.denominator){
            num = this.numerator/this.denominator;
            this.numerator %= this.denominator;
            return String.format("%d %d/%d",num,this.numerator,this.denominator);
        }
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

    public void update (int num, int denum)
    {
        // this method should update the value of the instance calling it
        int g;
        g = gcd(num, denum);

        num = num / g;
        denum = denum / g;
        this.numerator = num;
        this.denominator = denum; //danger
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

    public int compare (Rational x)//do
    {
        // this method should return:
        //      a negative number if the instance calling it is less than x
        //      zero if the instance calling it is equal to x
        //      a positive number if the instance calling it is greater than x
        double numa = this.numerator;
        double numb = x.numerator;
        double denuma = this.denominator;
        double denumb = x.denominator;
        double to_check = numa/denuma;
        double other = numb/denumb;
        int value = 2;
        if(to_check == other){
            value = 0;
        }
        if(to_check < other){
            value = -2;
        }
        return value;
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

    private void simplify()//do
    {
        int g = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator/g;
        this.denominator = this.denominator/g;
        if(this.denominator<0){
            this.denominator = this.denominator*-1;
            this.numerator = this.numerator*-1;
        }
    }


}
