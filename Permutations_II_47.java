import java.util.ArrayList;
import java.util.List;

public class Permutations_II_47 {
    
    public  List<List<Integer>> permute(int[] nums) {
        boolean[]used=new boolean[nums.length];
        ArrayList<Integer>permutation=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
       return backTrackPermut(nums,permutation,used,res);
    }
    public   List<List<Integer>> backTrackPermut(int[]nums, ArrayList<Integer> permutation, boolean[]used,List<List<Integer>>res){
        if (permutation.size()==nums.length){
           res.add(new ArrayList<>(permutation));
             return res;
        }
        for (int i=0;i<nums.length;i++){
            if (!used[i]){
                permutation.add(nums[i]);
                used[i]=true;
                backTrackPermut(nums,permutation,used,res);
                used[i]=false;
                permutation.remove(permutation.size()-1);
            }
        }
        return res;
    }
}
