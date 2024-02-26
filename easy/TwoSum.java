package easy;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println("["+twosum(nums, target)[0] + "," + twosum(nums, target)[1]+"]");
    }

    public static int[] twosum(int[] arr, int target) {
        int[] array = new int[2];
        for(int i=0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    array[0] = i;
                    array[1] = j;
                }
            }
        }
        return array;
    }
}