
import java.util.*;

public class Coordinate1D implements Coordinate
{
  private int xValue;
  private String label;

  public Coordinate1D(int thePoint, String theLabel)
  {
   xValue = thePoint;
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
    return Math.abs(this.xValue - ((Coordinate1D)(otherC)).xValue);
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
    
   


