public class Bicycles<i> {
    private static int numberOfBicycles = 0;
    private int id;

    public Bicycles ( int i) {
        id = ++numberOfBicycles;
    }

    public int getId () {
        return id;
    }
}
