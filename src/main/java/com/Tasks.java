package com;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tasks {
    public static List<Integer> task1(List<Object> list) {
        return list.stream().filter(Integer.class::isInstance).map(i -> (Integer) i).collect(Collectors.toList());
    }

    public static String task2(String str) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : str.toLowerCase().split("")) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        for (String s : str.split("")) {
            if (map.get(s.toLowerCase()) == 1) {
                return s;
            }
        }
        return "";
    }

    public static int task3(int input) {
        if (input < 10) {
            return input;
        }

        int temp = 0;
        while (input > 0) {
            temp += input % 10;
            input = input / 10;
        }
        return task3(temp);
    }

    public static int task4(List<Integer> input, int target) {
        List<Pair<Integer, Integer>> res = new ArrayList<>();
        IntStream.range(0, input.size())
                .forEach(i -> IntStream.range(0, input.size())
                        .filter(j -> i != j && input.get(i) + input.get(j) == target)
                        .forEach(j -> res.add(new Pair<>(input.get(i), input.get(j))))
                );
        return res.size() / 2;
    }

    public static String task5(String str) {
        Comparator<Pair<String, String>> comparatorL = Comparator.comparing(Pair::getL);
        Comparator<Pair<String, String>> comparatorR = Comparator.comparing(Pair::getR);
        Comparator<Pair<String, String>> comparator = comparatorR.thenComparing(comparatorL);

        return Arrays.stream(str.toUpperCase().split(";")).map(x -> {
            String[] result1 = x.split(":");
            return new Pair<>(result1[0], result1[1]);
        }).sorted(comparator).map(p -> "(" + p.getR() + ", " + p.getL() + ")").collect(Collectors.joining());
    }

    public static long task6(long n) {
        char[] digits = String.valueOf(n).toCharArray();
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] > digits[i - 1]) {
                int nBiggerIndex = i;
                for (int j = digits.length - 1; j > i; j--) {
                    if (digits[j] > digits[i - 1]) {
                        nBiggerIndex = j;
                        break;
                    }
                }
                char temp = digits[nBiggerIndex];
                digits[nBiggerIndex] = digits[i - 1];
                digits[i - 1] = temp;
                Arrays.sort(digits, i, digits.length);
                return Long.parseLong(new String(digits));
            }
        }
        return -1;
    }

    public static String task7(long ip) {
        long a = ip % 256;
        long b = (ip / 256) % 256;
        long c = (ip / (256 * 256)) % 256;
        long d = (ip / (256 * 256 * 256)) % 256;

        return d + "." + c + "." + b + "." + a;
    }

    private static class Pair<L, R> {
        private L l;
        private R r;

        public Pair(L l, R r) {
            this.l = l;
            this.r = r;
        }

        public L getL() {
            return l;
        }

        public void setL(L l) {
            this.l = l;
        }

        public R getR() {
            return r;
        }

        public void setR(R r) {
            this.r = r;
        }
    }
}