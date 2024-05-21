package exception;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Q1)WAP to perform subtraction of two matrices. 
		System.out.println("----------------Q1)WAP to perform subtraction of two matrices.---------------- ");
		 int[][] matrix1 = { {4,84,45}, {54, 45, 56}, {557, 48, 449} };
		 System.out.println("Matrix 1");
		 for (int i = 0; i < matrix1.length; i++) {
	            for (int j = 0; j < matrix1[0].length; j++) {
	                System.out.print(matrix1[i][j] + " ");
	            }
	            System.out.println();
	        }
		 
	     int[][] matrix2 = { {449, 48, 57}, {456, 45, 454}, {34, 542, 51} };
	     System.out.println("Matrix 2");
	     for (int i = 0; i < matrix2.length; i++) {
	            for (int j = 0; j < matrix2[0].length; j++) {
	                System.out.print(matrix2[i][j] + " ");
	            }
	            System.out.println();
	        }
	     int[][] result = new int[matrix1.length][matrix1[0].length];
	        for (int i = 0; i < matrix1.length; i++) {
	            for (int j = 0; j < matrix1[0].length; j++) {
	                result[i][j] = matrix1[i][j] - matrix2[i][j];
	            }
	        }
	        
	        
	        System.out.println("Result of subtraction:");
	        for (int i = 0; i < result.length; i++) {
	            for (int j = 0; j < result[0].length; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	        //Q5)Write a program to find the addition of two matrices using 2D array.
	        System.out.println("----------------Q5)Write a program to find the addition of two matrices using 2D array.----------------");
	        
	        for (int i = 0; i < matrix1.length; i++) {
	            for (int j = 0; j < matrix1[0].length; j++) {
	                result[i][j] = matrix1[i][j] + matrix2[i][j];//addition
	            }
	        }
	        System.out.println("Result of addition:");
	        for (int i = 0; i < result.length; i++) {
	            for (int j = 0; j < result[0].length; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println("----------------Q2)WAP to search a particular element in the given array.----------------");
	     //Q2)WAP to search a particular element in the given array.
	        // Initializing the array
	      int[] array= {2,34,5,6,53};
	      int num=34;
	      int index;
	      System.out.println("array list:");
	      for(int i=0;i<=array.length-1;i++) {
	    	  System.out.print(array[i]+" ");
	      }
	      System.out.println();
	      for(int i=0;i<=array.length-1;i++) {
	    	  
	    	  if(array[i]==num) {
	    		  index=i;
	    		  System.out.println("number "+num+" found at index: "+index);
	    	  }
	    	 
	      }
	      System.out.println("----------------Q3)WAP to print array in descending order.----------------");
	       // Sorting the array in ascending order
	        Arrays.sort(array);

	        // Reversing the array
	        descending(array);

	        // Printing the elements
	        System.out.println(Arrays.toString(array));
	        
	     //  Q6) Write a program to sort Array elements
	        System.out.println("----------------Q6) Write a program to sort Array elements----------------");
	        int temp=0;
	        for (int i = 0; i < array.length; i++) {     
	            for (int j = i+1; j < array.length; j++) {     
	               if(array[i] > array[j]) {    
	                   temp = array[i];    
	                   array[i] = array[j];    
	                   array[j] = temp;    
	               }     
	            }     
	        } 
	        System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < array.length; i++) {     
	            System.out.print(array[i] + " ");    
	        }    
	        
	    System.out.println();
	        
	        //Q4). Write a program on arrays to Read and Display all the array elements, find array length
	        System.out.println("----------------Q4). Write a program on arrays to Read and Display all the array elements, find array length----------------");
	        Scanner scanner = new Scanner(System.in);
	        
	        // Read array elements from the user
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        
	        int[] array1 = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array1[i] = scanner.nextInt();
	        }
	        
	        // Display array elements
	        System.out.println("Array elements:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(array1[i] + " ");
	        }
	        System.out.println();
	        
	        // Find array length
	        int length = array1.length;
	        System.out.println("Length of the array: " + length);
	        
	        scanner.close();
	            
	        
	    }

	//Q3)WAP to print array in descending order.
	    public static void descending(int[] array)
	    {
	        // Length of the array
	        int n = array.length;

	        // Swapping the first half elements 
	        // With last Half Elements
	        for (int i = 0; i < n / 2; i++) {

	            // Storing the first half elements temporarily
	            int temp = array[i];

	            // Assigning the first half
	              // to the last half
	            array[i] = array[n - i - 1];

	            // Assigning the last half
	            // to the first half
	            array[n - i - 1] = temp;
	            
	        }
	    }
	}
