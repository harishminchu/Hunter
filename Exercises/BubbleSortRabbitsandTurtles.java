package com.nth.test;

public class RabbitsAndTurtles { 
	/*Turtles and rabbits  
	One more problem of bubble sort is that its running time badly depends on the initial order of the
	elements. Big elements (rabbits) go up fast, while small ones (turtles) go down very slow. This
	problem is solved in the Cocktail sort.
	Turtle example. Thought, array {2, 3, 4, 5, 1} is almost sorted, it takes O(n2) iterations to sort an
	array. Element {1} is a turtle.


	Turtle example. Thought, array {2, 3, 4, 5, 1} is almost sorted, it takes O(n2) iterations to sort an
	array. Element {1} is a turtle.



	Rabbit example. Array {6, 1, 2, 3, 4, 5} is almost sorted too, but it takes O(n) iterations to sort it.
	Element {6} is a rabbit. This example demonstrates adaptive property of the bubble sort.
	BUBBLE SORT (Java) | Algorithms and Data Structures http://www.algolist.net/Algorithms/Sorting/Bubble_sort
	2*/
	
	
	public static void bubbleSort(int[] arr) {
		boolean swapped = true;
		int j = 0;
		int tmp;
		int count =0;
		while (swapped) {
			swapped = false;
			j++;//1 rabbit ={6, 1, 2, 3, 4, 5}
			for (int i = 0; i < arr.length - j; i++) {
				if (arr[i] > arr[i + 1]) {
					tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					swapped = true;
				}
			}
			count=count+1;
		}
		
		System.out.println("Count execution while loop"+count);
		for (int i : arr) {
			System.out.println(i);	
		}
		
	}

	public static void main(String[] args) {

		
		int[] rabbit ={6, 1, 2, 3, 4, 5};
		int[] turtle= {2, 3, 4, 5, 1};
		bubbleSort(rabbit);
		bubbleSort(turtle);
	}

}
