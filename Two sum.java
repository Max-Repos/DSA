// Approach : using hashmap, iterate through array simultaneously check is map contains target-currentElement (simply T=a+b -->b=T-a) else add curr ele to map.

public int[] twoSum(int[] nums, int target) {
int right = 0;
HashMap<Integer,Integer> map = new HashMap<>();

while(right < nums.length){
int compliment = target - nums[right];
if(map.containsKey(compliment)){
return new int[]{right,map.get(compliment)};
}else{
map.put(nums[right],right);
}
right++;
}
return new int[]{};
}
