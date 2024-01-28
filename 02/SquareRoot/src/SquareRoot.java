public class SquareRoot {
    public static void main ( String[] args ) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        if ( a == 0 ) {
            if ( b == 0 ) {
                System.out.println ( "x1=" );
                System.out.println ( "x2=" );
            } else {
                double x = -c / b;
                System.out.println ( "x1=" + (x == 0.0 ? 0.0 : x) );
                System.out.println ( "x2=" + (x == 0.0 ? 0.0 : x) );
            }
        } else {
            double discriminant = b * b - 4 * a * c;

            if ( discriminant > 0 ) {
                double x1 = (-b + Math.sqrt ( discriminant )) / (2 * a);
                double x2 = (-b - Math.sqrt ( discriminant )) / (2 * a);
                System.out.println ( "x1=" + (x1 == 0.0 ? 0.0 : x1) );
                System.out.println ( "x2=" + (x2 == 0.0 ? 0.0 : x2) );
            } else if ( discriminant == 0 ) {
                double x = -b / (2 * a);
                System.out.println ( "x1=" + (x == 0.0 ? 0.0 : x) );
                System.out.println ( "x2=" + (x == 0.0 ? 0.0 : x) );
            } else {
                System.out.println ( "x1=" );
                System.out.println ( "x2=" );
            }
        }
    }
}