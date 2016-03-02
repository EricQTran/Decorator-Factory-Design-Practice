import java.util.*;
public interface Coordinate
{
  public String label = null;

  public String toString();
  public int distance(Coordinate otherC) throws Exception;
  public void label(String theString);
  public String getLabel();
}



