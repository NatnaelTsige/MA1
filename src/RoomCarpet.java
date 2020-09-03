public class RoomCarpet {
    // Fields for dimension and cost of carpet per square ft (cPSF) declared but not initialized.
    private RoomDimension dimension;
    private double cPSF;


    public RoomCarpet(RoomDimension dimension, double cPSF) {
        super();
        this.dimension = dimension;
        this.cPSF= cPSF;
    }

    public double getTotalCost(){
        return dimension.getArea()*cPSF;
    }

    public String toString()
    {
        String console = dimension + "\nsquare ft carpet cost: $" + getTotalCost();
        return console;
    }

}