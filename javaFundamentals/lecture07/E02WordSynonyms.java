package lecture07;

import java.util.*;

public class E02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfWords = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonymDictionary =  new LinkedHashMap<>();

        for (int i = 0; i < countOfWords; i++) {
            String word = scanner.nextLine();       // cute
            String synonym = scanner.nextLine();    //adorable

            if (!synonymDictionary.containsKey(word)){
                List<String> synonymOfCurrentWord = new ArrayList<>();
                synonymOfCurrentWord.add(synonym);
                synonymDictionary.put(word,synonymOfCurrentWord);

            }else {
                List<String> synonymsOfCurrentWord = synonymDictionary.get(word);
                synonymsOfCurrentWord.add(synonym);
                synonymDictionary.put(word,synonymsOfCurrentWord);

            }
        }
        for (Map.Entry<String, List<String>> wordEntry : synonymDictionary.entrySet()){
            String currentWord = wordEntry.getKey();
            List<String> synonymsOfCurrentWord = wordEntry.getValue();
            System.out.printf("%s - %s%n",currentWord,String.join(", ",synonymsOfCurrentWord));
        }
    }
}
