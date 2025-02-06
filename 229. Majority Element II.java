class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int m1 = -1;
        int f1 = 0;
        int m2 = -1;
        int f2 = 0;
        for(int num: nums){
            if(f1 <= 0 && m2 != num){
                m1 = num;
                f1 = 1;
                continue;
            }
            if(f2 <= 0 && m1 != num){
                m2 = num;
                f2 = 1;
                continue;
            }
            if(num == m1){
                f1++;
            }else if(num == m2){
                f2++;
            }else{
                f1--;
                f2--;
            }
        }
        int c1 = 0;
        int c2 = 0;
        for(int num: nums){
            if(num == m1){
                c1++;
            }
            if(num == m2){
                c2++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        if(c1 > nums.length/3){
            ans.add(m1);
        }
        if(c2 > nums.length/3 && m1 != m2){
            ans.add(m2);
        }
        return ans;
    }
}
