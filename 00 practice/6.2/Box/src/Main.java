public class Main {
    public static void main ( String[] args ) {
        Box b1 = new Box ( 10, 20, 30 );
        Box b2 = new Box ( 40, 50, 60 );
        Box b3 = new Box ( );

        b1.print ( );
        b2.print ( );
        b3.print ( );

        b1 = b2;
        b1.print ( );

//        b1 = null;
//        b1.print ( );


        b1.print ();
        b1.change ( 100,200,300 );
        b1.print ();


    }
}