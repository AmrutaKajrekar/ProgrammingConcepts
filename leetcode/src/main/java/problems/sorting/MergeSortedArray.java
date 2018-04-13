package problems.sorting;

import java.util.Arrays;

/**
 * @author amruta.kajrekar
 * leetcode problem #88
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
The number of elements initialized in nums1 and nums2 are m and n respectively.
 *
 */
public class MergeSortedArray {

    public static void main(String[] args){
        MergeSortedArray array = new MergeSortedArray();
        int[] n1= {2,5,7,9,0,0,0};
        int[] n2= {1,3,8};

        array.merge3(n1,4,n2,3);
        System.out.println(Arrays.toString(n1));
    }

    public void merge(int[] arr1, int m, int[] arr2, int n) {

        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0)
            if((arr1[i]>arr2[j])){
                arr1[k]=arr1[i];
                i--;j--;k--;
            }else {
                arr1[k] = arr2[j];
                j--;k--;
            }

        while(j>=0) {
            arr1[k] = arr2[j];
            j--;k--;
        }
    }

    public void merge3(int[] A, int m, int[] B, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0) {
            A[k--] = (A[i--] > B[j--]) ? A[i--] : B[j--];
        }

        while(j>=0)
            A[k--]=B[j--];
    }
}
