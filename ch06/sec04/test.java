package ch06.sec04;

import java.util.ArrayList;
import java.util.List;

public class test {

    private static <T> void method1(List<T> list) {

    }

    private static void method2(List<?> list) {

    }

    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        method1(list1);
        method1(list2);
        method2(list1);
        method2(list2);
    }
}
