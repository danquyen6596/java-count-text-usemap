package vn.codegym.QuyenLeSy;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> treeMap = new TreeMap<>();

        System.out.println("Input string:" );
        String s = scanner.nextLine();
        s= s.toLowerCase();


        int i = 0;
        while (i != s.length())
        {
            if(treeMap.containsKey(s.charAt(i)))
            {
                int value = treeMap.get(s.charAt(i));
                treeMap.remove(s.charAt(i));
                treeMap.put(s.charAt(i),value+1);
            }

            else{
                treeMap.put(s.charAt(i),1);
            }
            i++;
        }

        System.out.println(treeMap);
    }
}
