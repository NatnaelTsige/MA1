public class RoomCarpet {
    // Fields for dimension and cost of carpet per square ft (cPSF) declared but not initialized.
    private RoomDimension dimension;
    private double cPSF;

    // value initializer Instance method for the fields.
    public RoomCarpet(RoomDimension dimension, double cPSF) {
        super();
        this.dimension = dimension;
        this.cPSF= cPSF;
    }

    // Instance method to calculate the total cost of the carpet.
    public double getTotalCost(){
        return dimension.getArea()*cPSF;
    }

    // display a string output on the terminal console.
    public String toString() {
        String console = dimension + "\nsquare ft carpet cost: $" + getTotalCost();
        return console;
    }

}