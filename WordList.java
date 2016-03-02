
import java.util.*;

public class WordList implements WordListInterface
{
 private List<String> words;

 public WordList() 
 { 
  words = new ArrayList<String>(); 
  words.add("what");
  words.add("no");
  words.add("Yes");

 }
 
 public String toString()
 {
   String retString = "";
         for (String word:words) retString += word + ";";
         return retString;
 }
 
 


}
