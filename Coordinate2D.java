import java.util.*;

public class Coordinate2D implements Coordinate
{
  private int xValue;
  private int yValue;
  private String label;

  public Coordinate2D(int x, int y, String theLabel)
  {
   xValue = x;
   yValue = y;
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
    return Math.abs(this.xValue - ((Coordinate2D)(otherC)).xValue); 
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
    

