package com.company;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String sentence_low = sentence.toLowerCase();
        String[] str = sentence_low.split(" ");
        Map<String, Long> slova = Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        if (slova.size() < n) n = slova.size();

        slova.entrySet().stream().sorted(new Comparator_m()).limit(n).forEach(System.out::println);
    }
}
