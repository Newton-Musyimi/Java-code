import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Alice{
    public static void main(String[] args)
    {
        File myFile = new File(args[0]);  // File ("myfile.txt")
        try
        {
            Scanner input = new Scanner(myFile);
            int lines = 0;
            int wordcount = 0;
            int characters = 0;
            int letters = 0;
            int punctuation = 0;
            int white_spaces = 0;
            String letter = "";
            String words = "";
            while(input.hasNextLine())
            {
                lines++;
                String str = input.nextLine();
                white_spaces += whiteSpaces(str);
                wordcount += wordCount(str);
                characters += charCount(str);
                letters += letterCount(str);
                punctuation += countPunct(str);
                letter = letter + alphabetPrint(str);
                words += getWords(str);
            }
            // System.out.printf("Lines = %d\n",lines);
            // System.out.printf("Words = %d\n",wordcount);
            // System.out.printf("Characters = %d\n",characters);
            // System.out.printf("Letters = %d\n",letters);
            // System.out.printf("Punctuation = %d\n",punctuation);
            // System.out.printf("White Spaces = %d\n",white_spaces);
            System.out.println(words);
            alphabetCount(letter);
            wordCountSort(words);
            input.close();
            
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("boo");
        }
      
    }
    public static void wordCountSort(String a){
        Boolean check = true;
        String[] str = a.split(" ");
        int string_length = str.length;
        String[] wordArray = new String[string_length];
        int index = 0;
        for(String i:str){
            for(String j:wordArray){
                if(j==i){
                    check=false;
                    break;
                }
            }
            if(check==true){
                wordArray[index]=i;
                if(wordArray[index]!=null){
                    System.out.println(wordArray[index]);
                }
                index++;
                
            }
            
        }
        for(String word:wordArray){
            int count = countFrequency(word,str);
            System.out.printf("%s    -> %d\n",word,count);
        }
    }
    public static int countFrequency(String word,String[] str){
        int count = 0;
        for(String i:str){
            if(word==i){
                count++;
            }
        }
        return count;
    }
    public static void wordSort(String a){
        Integer count = 0;
        char[] str = a.toCharArray();
        Integer len = str.length;
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(char i:alpha){
            count = alphaCount(i, str);
            System.out.printf("%c -> %d\n",i,count);
            percentagePrint(i,len, count);
        }
    }
    public static String getWords(String string){
        String result = "";
        String[] str = string.split(" ");
        for(String i:str){
            String word = i.toLowerCase();
            result+=" ";
            result += word;
        }
        return result;
    }
    public static int whiteSpaces(String a){
        int count = 0;
        char[] b = a.toCharArray();
        for(char i: b){
            if(i==' '){
                count++;
            }
        }
        return count;
    }
    public static int wordCount(String a){
        String[] str = a.split(" ");
        int count = str.length;
        return count;
    }
    public static int charCount(String a){
        char[] b = a.toCharArray();
        int count = b.length;
        return count;
    }
    public static int letterCount(String str){
        int count = 0;
        String a = str.toLowerCase();
        char[] b = a.toCharArray();
        for(char i: b){
            if(i>='a'&&i<='z'){
                count++;
            }
        }
        return count;
    }
    public static int countPunct(String a){
        int count = 0;
        char[] b = a.toCharArray();
        for(char i: b){
            if(i>='!'&&i<='/'){
                count++;
            }
            if(i>=':'&&i<='?'){
                count++;
            }
        }
        return count;
    }
    public static String alphabetPrint(String str){
        String letters = "";
        String a = str.toLowerCase();
        char[] b = a.toCharArray();
        for(char i: b){
            if(i>='a'&&i<='z'){
                letters += i;
            }
        }
        return letters;
    }
        
    public static void alphabetCount(String a){
        Integer count = 0;
        char[] str = a.toCharArray();
        Integer len = str.length;
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(char i:alpha){
            count = alphaCount(i, str);
            System.out.printf("%c -> %d\n",i,count);
            percentagePrint(i,len, count);
        }
    }
    public static void percentagePrint(char i,Integer a, Integer b){
        Double total = a.doubleValue();
        Double count = b.doubleValue();
        System.out.printf("%c -> %.2f%%\n\n",i,(count/total)*100);
    }
    public static int alphaCount(char al,char[] str){
        int count = 0;
        for(char i:str){
            if(i == al){
                count++;
            }
        }
        return count;
    }

}