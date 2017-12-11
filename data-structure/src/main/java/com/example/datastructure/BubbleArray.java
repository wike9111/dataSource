package com.example.datastructure;

/***
 * 冒泡排序方法
 */
public class BubbleArray {

    public static void main(String[] args){

        int[] arr = {12,37,48,11,5,2,23,34};
        bubbleApi(arr);
    }

    public static void bubbleApi( int [] arr){

        System.out.println("排序前数组：");
        for( int i : arr ){
            System.out.print( i + "\t");
        }
        System.out.println();
        System.out.println("冒泡排序后数组:");

        //每次循环少取一个元素做冒泡排序
        int temp ;
        for( int i =1;i<arr.length;i++){
            for( int j =0;j< arr.length -i ;j++ ){
                if( arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("每次循环后数组:");
            for( int m : arr ){
                System.out.print( m +"\t");
            }
            System.out.println();
        }
        for( int m : arr ){
            System.out.print( m +"\t");
        }

    }
}
