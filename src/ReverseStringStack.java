import java.util.Stack;

public class ReverseStringStack {
    public static void main(String[] args) {
        String word="Hello w";
        System.out.println("orginal word: "+word);
        System.out.println("Reversed word:"+new String(rev_string(word)));


    }
    public static char[] rev_string(String word)
    {
        Stack<Character> s=new Stack<>();
        char[] reverse=new char[word.length()];
        for(int i=0;i<word.length();i++)
        {
            System.out.println("Pushing"+word.charAt(i));
            s.push(word.charAt(i));

        }
        for(int i=0;i<word.length();i++)
        {
            reverse[i]=s.pop();
        }
        return reverse;
    }
}
