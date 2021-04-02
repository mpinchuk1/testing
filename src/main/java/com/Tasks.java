package com;

import org.javatuples.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class Tasks {

    public static List<Integer> task1(List<Object> list){
        return list.stream().filter(Integer.class::isInstance).map(i -> (Integer)i).collect(Collectors.toList());
    }

    public static String task2(String str) {

        Map<String, Integer> count = new HashMap<>();
        for (String element : str.toLowerCase().split("")
        ) {
            if (count.containsKey(element)) {
                count.put(element, count.get(element) + 1);
            } else {
                count.put(element, 1);
            }
        }

        for (String element : str.split("")
        ) {
            if (count.get(element.toLowerCase()) == 1) {
                return element;
            }
        }
        return "";
    }

    public static int task3(Integer number){
        if (number < 10){
            return number;
        }

        int temp = 0;
        while(number > 0) {
            temp += number % 10;
            number = number / 10;
        }
        return task3(temp);
    }

    public static int task4Loop(List<Integer> array, int n){
        int count = 0;
        for (int i = 0; i < array.size(); i++){
            for (int j = i + 1; j < array.size(); j++){
                if ((array.get(i) + array.get(j)) == n) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int task4Stream(List<Integer> array, int n){
        HashMap<Integer, Integer> counter = new HashMap<>();
        array.forEach(element -> {
            if (!counter.containsKey(element)) {
                counter.put(element, 0);
            }
            counter.put(element, counter.get(element) + 1);
        });
        int count = array.stream()
                .filter(element -> counter.get(n - element) != null)
                .mapToInt(element -> counter.get(n - element))
                .sum();
        return count / 2;
    }

    public static String task5(String string){
        String[] elements = string.toUpperCase().split(";");
        List<Pair<String, String>> persons = new ArrayList<>();
        for (String element : elements) {
            String[] temp = element.split(":");
            persons.add(new Pair<>(temp[1], temp[0]));
        }
        Collections.sort(persons);

        StringBuilder result = new StringBuilder();
        for (Object temp: persons.toArray()) {
            result.append(temp);
        }
        return result.toString();
    }

    public static int task1Extra(int n)
    {
        char [] s = String.valueOf(n).toCharArray();
        for(int i = s.length - 2; i >= 0; i--){
            for (int j = s.length-1; j > i; j--){
                if(s[i] < s[j]){
                    char tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                    Arrays.sort(s, i+1, s.length);
                    return Integer.parseInt(String.valueOf(s));
                }
            }
        }
        return -1;
    }

    public static String task2Extra(long ip) {
        String[] tmp = new String[4];
        int i = 4;
        while (i-- != 0) {
            tmp[i] = "" + (ip % 256);
            ip /= 256;
        }
        return String.join(".", tmp);
    }
}
