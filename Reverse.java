
import java.util.*;
public class Reverse extends WordListDecorator
{
  public Reverse(WordListInterface newWordList)
  {
    super(newWordList);
  }


  public String toString()
  {  

   String current = tempWordList.toString();
   String r = new StringBuffer(current).reverse().toString();

   return r;

  }




}
