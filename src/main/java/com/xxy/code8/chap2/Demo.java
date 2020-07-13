package com.xxy.code8.chap2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Demo {


    public static void main(String[] args) {
        // 1 2 3 4 5
        forEach(Arrays.asList(1,2,3,4,5), System.err::print);

        System.err.println();

        //7 2 6
        List<Integer> l = map(Arrays.asList("lambdas","in","action"),
                (String s) -> s.length());

        System.err.println("{card.score.config.bluetooth.16:{\n" +
                "\"guideCardScore\":0.582,\n" +
                "\"emptyCardScore\":0.181,\n" +
                "\"contentCardScore\":0.581\n" +
                "}}");

    }



    public static <T> void forEach(List<T> list, Consumer<T> c){
        list.forEach(c);
    }


    public static <T,R> List<R> map(List<T> list, Function<T,R> f){
        List<R> result = new ArrayList<>();
        list.forEach((i)-> System.err.print(f.apply(i)));
//        list.forEach((i) ->result.add(f.apply(i)));
        return result;

    }





}
