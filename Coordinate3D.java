import java.util.*;

public class Coordinate3D implements Coordinate
{
  private int xValue;
  private int yValue;
  private int zValue;
  private String label;

  public Coordinate3D(int x, int y, int z, String theLabel)
  {
   xValue = x;
   yValue = y;
   zValue = z;
   label = theLabel;
  }
  @Override
  public String toString()
  {
   return this.getLabel();
  }
  
  private int getPoint()
  {
    return this.xValue;
  }
  
  @Override
  public int distance(Coordinate otherC) throws Exception
  {
    if(!this.getClass().equals(otherC.getClass()))
    {
     throw new Exception();
    }
    return Math.abs(this.xValue - ((Coordinate3D)(otherC)).xValue); 
 }

  @Override
  public void label(String theString)
  {
   this.label = theString;
  }
  
  @Override
  public String getLabel()
  {
   return this.label;
  }

}
    

