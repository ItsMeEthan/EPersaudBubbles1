package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] testArr = {8,6,7,5,3,0,9,10,1,2,3};


        System.out.print("Before: ");
        for (int num:testArr)
            System.out.print(num+" ");
        System.out.println();


        bubbleSort.BubbleSort(testArr);

        System.out.print("After: ");
        for (int num:testArr)
            System.out.print(num+ " ");
        System.out.println();

    }
}
