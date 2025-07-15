package ReferenceList;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public static List<List<Integer>> generate(int n){
        List<List<Integer>> pascal = new ArrayList<>();

        for(int row = 0;row<n;row++){
            List<Integer> list = new ArrayList<>();
            for(int col = 0;col<=row;col++){
                if(col == 0 || col == row){
                    list.add(1);
                }
                else{
                    int val = pascal.get(row-1).get(col-1) + pascal.get(row-1).get(col);
                    list.add(val);
                }
            }
            pascal.add(list);
        }
        return pascal;
    }
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        ans = generate(5);
        System.out.println(ans);
    }
}
