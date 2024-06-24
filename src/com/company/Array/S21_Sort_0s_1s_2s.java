package com.company.Array;

public class S21_Sort_0s_1s_2s {
    public static void main(String[] args) {
        int[] arr = new int [] {0,2,1,2,0};
        int start = 0;
        int end = arr.length-1;
        int mid = start;

        while(mid<=end) {
            switch(arr[mid]) {
                case 0:
                    int temp1 = arr[start];
                    arr[start] = arr[mid];
                    arr[mid] = temp1;
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = arr[mid];
                    arr[mid] = arr[end];
                    arr[end] = temp2;
                    end--;
                    break;
            }
        }

        for(int e:arr) {
            System.out.print(e +" ");
        }
    }
}
