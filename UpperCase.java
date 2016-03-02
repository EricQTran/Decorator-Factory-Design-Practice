public class UpperCase extends WordListDecorator
{
  public UpperCase(WordListInterface newWordList)
  {
    super(newWordList);
  }

  public String toString()
  {  

    String upperCase = tempWordList.toString();

    String result = upperCase.toUpperCase();
    

    return result;
  }

}
