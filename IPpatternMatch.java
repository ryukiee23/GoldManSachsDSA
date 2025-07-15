package GoldManSachsQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPpatternMatch {
    static String ans="";
    public static String extractString(String log){
        Pattern pattern = Pattern.compile("\\b(\\d{1,3}(\\.\\d{1,3}){3})\\b");
        Matcher matcher = pattern.matcher(log);

        if(matcher.find()){
            String ip = matcher.group();
            if(isValid(ip)) return ip;
        }
        return null;
    }
    public static boolean isValid(String ip){
        String[] parts = ip.split("\\.");

        if(parts.length != 4) return false;

        for(String part:parts){
            int num = Integer.parseInt(part);
            if(num < 0 || num > 255) return false;
        }
        return true;
    }
    public static int solve(String[] s){
        Map<String,Integer> map = new HashMap<>();

        int maxAns = 0;

        for(String log:s){
            String valid = extractString(log);
            if(valid != null){
                map.put(valid,map.getOrDefault(valid,0)+1);

                if(map.get(valid) > maxAns){
                    maxAns = map.get(valid);
                    ans = valid;
                }
            }
        }
        return maxAns;
    }
    public static void main(String[] args){
        String [] str = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93",
        };
        System.out.println(solve(str));

    }
}
