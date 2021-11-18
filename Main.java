package com.thoughtworksProgram;
import java.util.Scanner;
import  java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);

        int size=scanner.nextInt();

        int[] array=new int[size];

        for(int i=0;i<size;i++)
             array[i]=scanner.nextInt();

        Arrays.sort(array);

        int range= array[size-1]-array[0];
        System.out.println("Array range:" + range);


    }
}
