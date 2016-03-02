public class CoordinateDemo
{
  public static void main(String[] args)
  {
   CoordinateFactory cF = new CoordinateFactory();
   Coordinate oneD = cF.getCoordinate("Coordinate1D");
   Coordinate oneD2 = cF.getCoordinate("Coordinate2D");
   Coordinate threeD = cF.getCoordinate("Coordinate3D");

   System.out.println("Label of 1D Coordinate");
   System.out.println(oneD.getLabel());

   System.out.println("Label of 2D Coordinate");
   System.out.println(oneD2.getLabel());
   
   System.out.println("Label of 3D Coordinate");
   System.out.println(threeD.getLabel());
   
   
   
  }
}

