package com.example.datastructure;

import java.util.Arrays;

/***
 * 数组sort排序
 */
public class ApiArray {

    public static void main(String[] args){

        int [] arr = { 1,4,2,7,5,8,3,6};
        sortApi(arr );
    }

    public static void sortApi(int [] arr){

        System.out.println("排序前的数组:" );
        for (int a : arr){
            System.out.print(a +"\t");
        }

        System.out.println();
        System.out.println("排序后的数组:");
        Arrays.sort(arr);
        for( int a : arr ){
            System.out.print(a +"\t");
        }

    }
}
