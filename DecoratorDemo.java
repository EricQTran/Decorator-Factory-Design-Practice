public class DecoratorDemo 
{
  public static void main( String[] args )
  {
   WordListInterface word = new WordList();
   

   WordListInterface uC = new UpperCase(new WordList());
   WordListInterface filter = new FilterGreater(new WordList());
   WordListInterface reverse = new Reverse(new WordList());


   
   System.out.println("ORIGINAL WORDS");
   System.out.println(word.toString());
   System.out.println("UPPERCASE");
   System.out.println(uC.toString());
   System.out.println("REVERSE");
   System.out.println(reverse.toString());

   System.out.println("Filtering on words greater than 'aaa'");
   System.out.println(filter.toString());


  }
}
