public class TestRational
{
    public static void main (String[] args)
    {
        Rational a = new Rational(1, 2);
        Rational b = new Rational(3, 4);
        Rational c = new Rational();

        c.add(a, b);
        System.out.println(a.toString() + " + " + b.toString() + " = " + c.toString());

        c.sub(a, b);
        System.out.println(a.toString() + " - " + b.toString() + " = " + c.toString());

        c.mul(a, b);
        System.out.println(a.toString() + " * " + b.toString() + " = " + c.toString());

        c.div(a, b);
        System.out.println(a.toString() + " / " + b.toString() + " = " + c.toString());

        c.update(a.getNumerator(), a.getDenominator());
        System.out.println(c.toString() + " == " + a.toString() + " : " + c.equals(a));
        System.out.println(c.toString() + " == " + b.toString() + " : " + c.equals(b));
        
        System.out.println(a.toString() + " compared to " + b.toString() + " : " + a.compare(b));
        System.out.println(a.toString() + " compared to " + a.toString() + " : " + a.compare(a));
        System.out.println(b.toString() + " compared to " + a.toString() + " : " + b.compare(a));

        c.update(11, 4);
        System.out.println(c.toString());

        c.update(10, 2);
        System.out.println(c.toString());
    }
}
