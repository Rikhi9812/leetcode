package hard;

import java.util.Arrays;

//Median of Two Sorted Arrays
public class MTSA {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int mergedArray[] = new int[len];
        int j = 0;
        double m;
        for(int i : nums1) {
            mergedArray[j] = i;
            j++;
        } 
        for(int i : nums2) {
            mergedArray[j] = i;
            j++;
        }

        Arrays.sort(mergedArray);
        int  mergedArraylen = mergedArray.length;
        int divide = mergedArraylen /2;
        if(mergedArraylen % 2 == 0){
            m = (float)mergedArray[divide] + mergedArray[divide-1] / (float)2;
        } else {
            m = mergedArray[divide];
        }

        return m;
        
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {5 , 6};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    
}
