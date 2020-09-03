class RoomDimension {

   //Fields for the length and width declared but not initialized.
   private double length;
   private double width;

   //Instance method. Assigns value to the fields.
   public RoomDimension(double length, double width) {
      this.length = length;
      this.width = width;
   }

   // Returns the area.
   public double getArea() {
      return length * width;
   }

   // display a string output on the terminal console.
   public String toString() {
      String console;
      console = "Room dimensions:\n\t- Length: " + length + "\n\t- Width: " + width + "\n\t - Area: " + getArea();
      return console;
   }

}