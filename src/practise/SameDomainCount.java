package practise;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SameDomainCount {

    public static void main(String[] args) {
        String[] counts = {
                "900,google.com",
                "60,mail.yahoo.com",
                "10,mobile.sports.yahoo.com",
                "40,sports.yahoo.com",
                "300,yahoo.com",
                "10,stackoverflow.com",
                "20,overflow.com",
                "5,com.com",
                "2,en.wikipedia.org",
                "1,m.wikipedia.org",
                "1,mobile.sports",
                "1,google.co.uk"
        };

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String str : counts) {
            String arr[] = str.split(",");
            int count = Integer.parseInt(arr[0]);
            String domain = arr[1];
            int length = domain.length();
            if (map.containsKey(domain)) {
                map.put(domain, map.get(domain) + count);
            } else {
                map.put(domain, count);
            }
            for (int i = 0; i < length; i++) {
                if (domain.charAt(i) == '.') {
                    String temp = domain.substring(i + 1, length);
                    if (map.containsKey(temp)) {
                        map.put(temp, map.get(temp) + count);
                    } else {
                        map.put(temp, count);
                    }
                }
            }
        }
        List<String> list = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String num = entry.getValue() + "";
            list.add(num + " :" + entry.getKey());
        }

        System.out.println(list);
    }


}
