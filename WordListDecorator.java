
public abstract class WordListDecorator implements WordListInterface
{
  protected WordListInterface tempWordList;

  public WordListDecorator(WordListInterface theWordList)
  {
    tempWordList = theWordList;
  }

  public String toString()
  {
    return tempWordList.toString();
  }

}
