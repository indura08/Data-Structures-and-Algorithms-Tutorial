package LeetcodeAnswers.ArrayProblems;

import java.util.Arrays;

public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        //1st way
//        int[] temp = new int[m+n];
//        int index = 0;
//
//        while(index<m){
//            temp[index] = nums1[index];
//            index++;
//        }
//
//        for(int j = 0; j < n; j++){
//            temp[index] = nums2[j];
//            index++;
//        }
//
//        Arrays.sort(temp);
//
//        for(int k = 0; k<m+n; k++){
//            nums1[k] = temp[k];
//        }

        //second way
        for(int i = m; i< nums1.length; i++){
            nums1[i] = nums2[i-m];
        }

        Arrays.sort(nums1);

    }
}
