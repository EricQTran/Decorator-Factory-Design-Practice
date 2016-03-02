public class FilterGreater extends WordListDecorator
{
  public String compare = "aaa";

  public FilterGreater(WordListInterface newWordList)
  {
    super(newWordList);
  }

  public String toString()
  {  
    
    String current = tempWordList.toString();
    if(current.compareTo(compare) > 0)
    {
     return "";
    }

    return current;
    

  }

  public String getString()
  {
    return this.compare;
  

  }
  
      

}
