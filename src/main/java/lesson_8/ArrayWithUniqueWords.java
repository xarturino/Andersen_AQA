package lesson_8;

import java.util.*;
import static lesson_8.ArrayWithUniqueWords.countWordExistInList;
import static lesson_8.ArrayWithUniqueWords.uniqueWordsList;

public class ArrayWithUniqueWords {

    public static void uniqueWordsList(List list){
        HashSet uniqueWords = new HashSet<>(list);
        System.out.printf("Unique values: %s" + " Unique size: " + uniqueWords.size() ,uniqueWords);
    }

    public static void countWordExistInList(List list){
        Set<String> set = new LinkedHashSet<>(list);
        for (String name: set){
            System.out.print(" " + name + ":" + Collections.frequency(list,name));
        }
    }
}


class ArrayWithUniqueWordsTest{
    public static void main(String[] args) {

        List<String> arrayList = Arrays.asList
                ("Steve", "Sven", "John", "William", "Rodger", "Brian", "Jimmy", "Jack", "Fred", "Chester",
                        "Mike", "Correy", "Joy", "Ross", "Fred", "Kurt", "John", "Adam", "Lambert", "William");

        uniqueWordsList(arrayList);
        System.out.println();
        countWordExistInList(arrayList);
    }
}