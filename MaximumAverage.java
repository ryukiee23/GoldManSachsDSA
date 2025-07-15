package ReferenceList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumAverage {
    static String student = "";
    public static double highestAverage(String[][] records){
        Map<String, List<Integer>> m = new HashMap<>();
        for(String s[]:records){
            String temp = s[0];
            int num = Integer.parseInt(s[1]);
            List<Integer> list = m.get(temp);
            if(list == null){
                list = new ArrayList<>();
                m.put(temp,list);
            }
            list.add(num);
        }
        double avg = Double.MIN_VALUE;


        for(Map.Entry<String,List<Integer>> me:m.entrySet()){
            List<Integer> temp = me.getValue();
            double len = temp.size();
            double maxSum = temp.stream().reduce(0,(a,b)->a+b);

            double maxAvg = maxSum/len;

            if(maxAvg > avg){
                avg = maxAvg;
                student = me.getKey();
            }
        }
        return avg;
    }
    public static void main(String[] args){

        String[][] records = { { "Charles", "84" }, { "John", "100" }, { "Andy", "37" }, { "John", "23" },
                { "Charles", "20" } };

        double result = highestAverage(records);
        System.out.println(result);
        System.out.println(student);
    }
}
