package com.pishu;
//arrays in java
public class Day1 {
    public static void main(String[] args){
        System.out.println("Hello World");
        int[] arr={1,2,3,4,5,6,7,8,9,10};//primitive array
        int n=arr.length;
        System.out.println("primitive array-->");
        for (int i=0;i<n;i++)
            System.out.println(arr[i]+ " ");
        System.out.println();
        String[] names={"lakshit","rahul","pankaj"};//non primitive array
        System.out.println();
        System.out.println("non primitive array-->");
        for (int i = 0; i < names.length; i++) {
        System.out.println(names[i]); 
        }
    }  
}
