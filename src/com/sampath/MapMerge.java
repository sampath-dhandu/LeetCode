package com.sampath;

import java.util.HashMap;
import java.util.Map;

public class MapMerge {

    public static void main(String[] args) {

        Map<String,Integer> testMap= new HashMap<>();
        testMap.put("sampath",100);
        testMap.merge("sampath",50,Integer::sum);
        System.out.println(testMap.get("sampath"));

        Map<String,Integer> map1= new HashMap<>();
        map1.put("sampath",100);
        map1.put("gowtham",50);

        Map<String,Integer> map2= new HashMap<>();
        map2.put("sampath",100);
        map2.put("vihaan",50);


        Map<String,Integer> mergeMap= new HashMap<>(map1);
        map2.forEach((key,value) -> mergeMap.merge(key,value,Integer::sum));

        System.out.println("merged map" + mergeMap);


    }
}
