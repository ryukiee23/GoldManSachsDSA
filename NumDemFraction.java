package GoldManSachsQuestions;

import java.util.HashMap;
import java.util.Map;

public class NumDemFraction {
    public static String solve(int num,int dem){
        if(num == 0){
            return "0";
        }

        StringBuilder ans = new StringBuilder();

       boolean negative = (num * dem < 0);

        if(negative){
            ans.append("-");
        }

        long numm = (long)num;
        long demm = (long)dem;
        long intPart = Math.abs(numm/demm);
        ans.append(intPart);

        long rem = numm%demm;
        if(rem == 0){
            return ans.toString();
        }

        ans.append('.');

        Map<Long,Integer> map = new HashMap<>();

        while(rem != 0) {

            if(map.containsKey(rem)){
                int idx = map.get(rem);
                ans.insert(idx,'(');
                ans.append(')');
                break;
            }

            map.put(rem, ans.length());

            rem = rem * 10;
            ans.append(rem / demm);
            rem = rem % demm;
        }

        return ans.toString();

    }
    public static void main(String[] args) {

        System.out.println(solve(50,22));
        System.out.println(solve(1,2));
        System.out.println(solve(1,-2));
    }
}
