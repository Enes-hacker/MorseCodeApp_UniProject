import java.util.Locale;
import java.util.Scanner;

public class Application {



    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        char [] englishAlphabet = { 'a', 'b', 'c', 'd','e','f','g','h',
                'i', 'j', 'k', 'l','m','n','o','p','q','r', 's', 't', 'u','v','w','x','y','z',
                '\u0000','?', '.'
        };

        String [] morseAlphabet = { "@(", "!@", "(", "@!" ,"(-","!-","&","!%",
                "!", ".!", "!<", "!!","^^","%","()","!^@","!.@", "@<", ")(", "/_","^>","<!>","><",
                "<>",".=.","#$", "***", "$$$", "|...|"
        };


        System.out.println("Enter a word or a sentence");
        String morseConverter = keyboard.next().toLowerCase(Locale.ROOT);
       // morseConverter = keyboard.next().toUpperCase(Locale.ROOT);

        char[] english = morseConverter.toCharArray();

        String string = "";


        for (int i = 0; i < english.length; i++){
            for (int index = 0; index < englishAlphabet.length; index++){
                if ( englishAlphabet[index] == english[i]) {
                    string = string + morseAlphabet[index] + "";

                }
            }

        }

        String  posstring = "[]";
        int pos = 0;
        int posindex = 0;
        for ( pos = 0; pos < english.length; pos++) {
            for ( posindex = 0; posindex < englishAlphabet.length; posindex++) {
                if ((englishAlphabet[posindex]  == english[pos])) {
                    posstring  = posstring + "["+ morseAlphabet[posindex] +"]";
                }
            }
        }

        System.out.println("Translation: " + string);
            System.out.println(posstring);






    }
}
