/**
 * Lab 10 Car class
 * @author Ryan S
 *
 */
 public class Car extends Vehicle
 {
 	 private int doorNum;
 	 private int passNum;
 	 
 	 public Car(String aMake, String aModel, String aPlate, int aDoor, int aPass)
 	 {
 	 	 super(aMake, aModel, aPlate);
 	 	 this.doorNum = aDoor;
 	 	 this.passNum = aPass;
 	 }
 	 
 	 public int getDoors()
 	 {
 	 	 return this.doorNum;
 	 }
 	 
 	 public int getPassengers()
 	 {
 	 	 return this.passNum;
 	 }
 	 
 	 @Override
 	 public String toString()
 	 {
 	 	 return "" + this.doorNum + "-door " + super.toString();
 	 }
 	 
 	 @Override
 	 public boolean equals(Object other)
 	 {
 	 	 if (!(other instanceof Car))
 	 	 {
 	 	 	 return false;
 	 	 }
 	 	 
 	 	 Car otherCar = (Car) other;
 	 	 
 	 	 if (this.doorNum == otherCar.getDoors())
 	 	 {
 	 	 	 if (this.passNum == otherCar.getPassengers())
 	 	 	 {
 	 	 	 	 return super.equals(other);
 	 	 	 }
 	 	 }
 	 	 return false;
 	 }
 	 
 	 public Car copy()
 	 {
 	 	 return new Car(this.getMake(), this.getModel(), this.getPlate(), this.getDoors(), this.getPassengers());
 	 }
 	 
 	 public static void main(String args[])
 	 {
 	 	 Car aCar = new Car("Make", "Model", "PLATE", 4, 5);
 	 	 Car bCar = new Car("Make", "Model", "PLATE", 4, 6);
 	 	 Car cCar = new Car("Make", "Model", "PLATE", 3, 5);
 	 	 Car dCar = new Car("Make", "Mdeel", "PLATE", 4, 5);
 	 	 Car eCar = aCar.copy();
 	 	 System.out.println(aCar.toString());
 	 	 System.out.println("A-B: " + aCar.equals(bCar));
 	 	 System.out.println("A-C: " + aCar.equals(cCar));
 	 	 System.out.println("A-D: " + aCar.equals(dCar));
 	 	 System.out.println("A-E: " + aCar.equals(eCar));
 	 }
 }