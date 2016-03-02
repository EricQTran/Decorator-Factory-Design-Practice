public class CoordinateFactory
{
  public Coordinate getCoordinate(String cType)
  {
    if(cType == null)
    {
      return null;
    }
    
    if(cType.equalsIgnoreCase("COORDINATE1D"))
    {
      return new Coordinate1D(1,"OneDimensional");
    }
    else if (cType.equalsIgnoreCase("COORDINATE2D"))
    {
      return new Coordinate2D(2, 4, "TwoDimensional");
    }
    else if (cType.equalsIgnoreCase("COORDINATE3D"))
    {
      return new Coordinate3D(6, 8 , 10, "ThreeDimensional");
    }
 
    return null;
   }
}
