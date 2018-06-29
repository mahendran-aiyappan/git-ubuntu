package org.woodworks;



import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class LinkedHashMapPerformanceTest {
    public static void main(String[] args) {
	System.out.println("started the testing");
        Map<String, String> map = create();
        Random rand = new Random();

        while (true) {
            map.get(rand.nextInt(100000));
        }
    }

    public static Map<String, String> create() {
        Map<String, String> map = new ConcurrentHashMap();
        for (int i = 0; i <= 100000; i++) {
            map.put(String.valueOf(i), String.valueOf(i - 1));
        }
        return map;
    }
}
