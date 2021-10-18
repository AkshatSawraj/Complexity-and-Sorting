package Utilities;

import java.util.Comparator;

import Shapes3D.Shape;

public class Utility {

	public Utility() {
		super();
	}


	long start, stop, timeTaken;

	// new array
	public void bubbleSort(Shape[] arr, Comparator<Shape> compare) {
		
		start = System.currentTimeMillis();

		// Length of an array
		int n = arr.length;
		
		// Holder for temp value
		Shape temp = null;
		// Bubble Sort
		if (compare != null) {
			for (int i = 0; i < n; i++) {
				if (i == 1) {
					
					System.out.println("The first value is: " + arr[i]);
					}
				else if (i == arr.length - 1) {
					System.out.println("The last value is: " + arr[i]);
					}
				else if (i % 1000 == 999) {
					System.out.println("The " + (i + 1) + "th value is: " + arr[i]);				
				}	

				for (int j = 1; j < (n - i); j++) {
// 
					if (compare.compare(arr[j -1], arr[j]) == 1) {
						// Exchange placement
						temp = arr[j - 1];
						arr[j - 1] = arr[j];
						arr[j] = temp;
					}
				}
			}
		} else {
			for (int i = 0; i < n; i++) {
				if (i == 0)
					System.out.println("The first value is: " + arr[i].toString());
				else if (i == arr.length - 1)
					System.out.println("The last value: " + arr[i].toString());
				else if (i % 1000 == 999) {
					System.out.println("The " + (i + 1) + "th value: " + arr[i].toString());				
				}
				for (int j = 1; j < (n - i); j++) {
					if (arr[j - 1].compareTo(arr[j]) == 1) {
						
						// Exchange placement
						temp = arr[j - 1];
						arr[j - 1] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		stop = System.currentTimeMillis();
		timeTaken = stop - start;
		System.out.println("The time talen for sorting is: " + timeTaken + "ms");
		
	}


	//***************** SORTING ALGORITHM SPARATION LINE*****************//


	Shape temp;
	Comparator<Shape> compare;

	public void heapSort(Shape arr[], Comparator<Shape> compare) {
		start = System.currentTimeMillis();
		this.compare = compare;
		int size = arr.length;
		int i;

		for (i = size / 2 - 1; i >= 0; i--)
			heapify(arr, size, i);

		for (i = size - 1; i >= 0; i--) {
			if (i == 0)
				System.out.println("The first value is: " + arr[i].toString());
			else if (i == arr.length - 1)
				System.out.println("The last value: " + arr[i].toString());
			else if (i % 1000 == 999) {
				System.out.println("The " + (i + 1) + "th value: " + arr[i].toString());				
			}
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);

		}
		stop = System.currentTimeMillis();
		timeTaken = stop - start;
		System.out.println("The time talen for sorting is: " + timeTaken + "ms");

	}

	void heapify(Shape arr[], int size, int i) {
		if (compare != null) {
			int largest = i;
			int left = 2 * i + 1;
			int right = 2 * i + 2;

			if (left < size && compare.compare(arr[left], arr[largest]) == -1)
				largest = left;

			if (right < size && compare.compare(arr[right], arr[largest]) == -1)
				largest = right;

			if (largest != i) {
				temp = arr[i];
				arr[i] = arr[largest];
				arr[largest] = temp;
				heapify(arr, size, largest);
			}
		} else {
			int largest = i;
			int left = 2 * i + 1;
			int right = 2 * i + 2;

			if (left < size && arr[left].compareTo(arr[largest]) == -1)
				largest = left;

			if (right < size && arr[right].compareTo(arr[largest]) == -1)
				largest = right;

			if (largest != i) {
				temp = arr[i];
				arr[i] = arr[largest];
				arr[largest] = temp;
				heapify(arr, size, largest);
			}

		}
	}


	//***************** SORTING ALGORITHM SPARATION LINE*****************//


	/* Function to sort array using insertion sort */
	public void insertionSort(Shape arr[], Comparator<Shape> compare) {
		start = System.currentTimeMillis();
		int n = arr.length;
		if (compare != null) {
			for (int i = 1; i < n; ++i) {
				if (i == 0)
					System.out.println("The first value is: " + arr[i].toString());
				else if (i == arr.length - 1)
					System.out.println("The last value: " + arr[i].toString());
				else if (i % 1000 == 999) {
					System.out.println("The " + (i + 1) + "th value: " + arr[i].toString());				
				}
				Shape key = arr[i];

				int j = i - 1;

				/*
				 * Move elements of arr[0..i-1], that are greater than key, to one position
				 * ahead of their current position
				 */
				while (j >= 0 && compare.compare(arr[j], key)==-1) {

					arr[j + 1] = arr[j];

					j = j - 1;

				}

				arr[j + 1] = key;
			}
		}
		else {
			for (int i = 1; i < n; ++i) {
				if (i == 0)
					System.out.println("The first value is: " + arr[i].toString());
				else if (i == arr.length - 1)
					System.out.println("The last value: " + arr[i].toString());
				else if (i % 1000 == 999) {
					System.out.println("The " + (i + 1) + "th value: " + arr[i].toString());				
				}
				Shape key = arr[i];

				int j = i - 1;

				/*
				 * Move elements of arr[0..i-1], that are greater than key, to one position
				 * ahead of their current position
				 */
				while (j >= 0 && arr[j].compareTo(key)==-1) {

					arr[j + 1] = arr[j];

					j = j - 1;

				}

				arr[j + 1] = key;
			}
		}
		stop = System.currentTimeMillis();
		timeTaken = stop - start;
		System.out.println("The time talen for sorting is: " + timeTaken + "ms");
	}


	//***************** SORTING ALGORITHM SPARATION LINE*****************//


	//TO USE CLASS, Call mergeSort.   For recursive purposes, there is mergeInitial and mergSort.

	public void mergeSort(Shape arr[], Comparator<Shape> compare) {
		this.compare=compare;
		mergeSort(arr,0,arr.length-1);
	}

	void mergeInitial(Shape arr[], int beg, int mid, int end) {

		/* NOTES - I think I need to fix the inputs to automatically calculate the beginning middle and end.
		 		Not sure if this would happen that the utility state, or for any Array sent to Merge, should it belong in the merge class.

		 */

		int l = mid - beg + 1;
		int r = end - mid;

		Shape LeftArray[] = new Shape[l];
		Shape RightArray[] = new Shape[r];

		for (int i = 0; i < l; ++i)
			LeftArray[i] = arr[beg + i];

		for (int j = 0; j < r; ++j)
			RightArray[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = beg;
		if (compare!=null) {
			while (i < l && j < r) {
				if (compare.compare(LeftArray[i], RightArray[j])==1 || compare.compare(LeftArray[i], RightArray[j])==0) {
					arr[k] = LeftArray[i];
					i++;
				} else {
					arr[k] = RightArray[j];
					j++;
				}
				k++;
			}
		}
		else {
			while (i < l && j < r) {
				if (LeftArray[i].compareTo(RightArray[j])==1 || LeftArray[i].compareTo(RightArray[j])==0) {
					arr[k] = LeftArray[i];
					i++;
				} else {
					arr[k] = RightArray[j];
					j++;
				}
				k++;
			}
		}

		while (i < l) {
			arr[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < r) {
			arr[k] = RightArray[j];
			j++;
			k++;
		}
	}

	void mergeSort(Shape arr[], int beg, int end) {
		start = System.currentTimeMillis();
		if (beg < end) {
			int mid = (beg + end) / 2;
			mergeSort(arr, beg, mid);
			mergeSort(arr, mid + 1, end);
			mergeInitial(arr, beg, mid, end);
		}
		for(int i=0;i<arr.length;i++) {
			if (i == 0)
				System.out.println("The first value is: " + arr[i].toString());
			else if (i == arr.length - 1)
				System.out.println("The last value is: " + arr[i].toString());
			else if (i % 1000 == 999) {
				System.out.println("The " + (i + 1) + "th value is: " + arr[i].toString());				
			}	
		}
		stop = System.currentTimeMillis();
		timeTaken = stop - start;
		System.out.println("The time talen for sorting is: " + timeTaken + "ms");
	}


	//***************** SORTING ALGORITHM SPARATION LINE*****************//


	public void quickSort(Shape[] arr, Comparator<Shape> compare) {
		this.compare = compare;
		quickSort(arr, 0, arr.length - 1);
	}

	void quickSort(Shape a[], int beg, int end) {
		start = System.currentTimeMillis();
		int loc;
		if (beg < end) {
			loc = partition(a, beg, end);
			quickSort(a, beg, loc - 1);
			quickSort(a, loc + 1, end);
		}
		for(int i=0;i<a.length;i++) {
			if (i == 0)
				System.out.println("The first value is: " + a[i].toString());
			else if (i == a.length - 1)
				System.out.println("The last value is: " + a[i].toString());
			else if (i % 1000 == 999) {
				System.out.println("The " + (i + 1) + "th value is: " + a[i].toString());				
			}	
		}
		stop = System.currentTimeMillis();
		timeTaken = stop - start;
		System.out.println("The time talen for sorting is: " + timeTaken + "ms");
	}

	public int partition(Shape a[], int beg, int end) {
		int left, right, loc, flag;
		Shape temp;
		loc = left = beg;
		right = end;
		flag = 0;
		if (compare != null) {
			while (flag != 1) {
				while ((compare.compare(a[loc], a[right]) == 1 || compare.compare(a[loc], a[right]) == 0)
						&& (loc != right))
					right--;
				if (loc == right)
					flag = 1;
				else if (compare.compare(a[loc], a[right]) == -1) {
					temp = a[loc];
					a[loc] = a[right];
					a[right] = temp;
					loc = right;
				}
				if (flag != 1) {
					while ((compare.compare(a[loc], a[right]) == -1 || compare.compare(a[loc], a[right]) == 0)
							&& (loc != left)) {
						left++;
					}
					if (loc == left) {
						flag = 1;
					} else if (compare.compare(a[loc], a[right]) == 1) {
						temp = a[loc];
						a[loc] = a[left];
						a[left] = temp;
						loc = left;
					}
				}
			}
		} else {
			while (flag != 1) {
				while ((a[loc].compareTo(a[right])  == 1 || a[loc].compareTo(a[right]) == 0)&& (loc != right))
					right--;
				if (loc == right)
					flag = 1;
				else if ((a[loc].compareTo(a[right]) == -1)) {
					temp = a[loc];
					a[loc] = a[right];
					a[right] = temp;
					loc = right;
				}
				if (flag != 1) {
					while ((a[loc].compareTo(a[right]) == -1 || a[loc].compareTo(a[right]) == 0)
							&& (loc != left)) {
						left++;
					}
					if (loc == left) {
						flag = 1;
					} else if (a[loc].compareTo(a[right]) == 1) {
						temp = a[loc];
						a[loc] = a[left];
						a[left] = temp;
						loc = left;
					}
				}
			}
		}

		return loc;
	}
	
	
	//***************** SORTING ALGORITHM SPARATION LINE*****************//
	
	
	public void selectionSort(Shape arr[], Comparator<Shape> compare ) {
		this.compare=compare;
		selectionSort(arr);
	}
    void selectionSort(Shape[] arr){
    	start = System.currentTimeMillis();
    	if(compare!=null) {
    		  for (int i = 0; i < arr.length - 1; i++) {
    			  if (i == 0)
						System.out.println("The first value is: " + arr[i].toString());
					else if (i == arr.length - 1)
						System.out.println("The last value: " + arr[i].toString());
					else if (i % 1000 == 999) {
						System.out.println("The " + (i + 1) + "th value: " + arr[i].toString());				
					}
    	            int index = i;  
    	            
    	            for (int j = i + 1; j < arr.length; j++){  
    	            
    	            	if (compare.compare(arr[j], arr[index]) == 1){  
    	                
    	            		index = j;//searching for lowest index  
    	                
    	            	}  
    	            
    	            }  
    	            
    	            Shape smallerNumber = arr[index];   
    	            
    	            arr[index] = arr[i];  
    	            
    	            arr[i] = smallerNumber;  
    	        
    	        } 
    	}
    	else {
    		  for (int i = 0; i < arr.length - 1; i++) {
    			  if (i == 0)
						System.out.println("The first value is: " + arr[i].toString());
					else if (i == arr.length - 1)
						System.out.println("The last value: " + arr[i].toString());
					else if (i % 1000 == 999) {
						System.out.println("The " + (i + 1) + "th value: " + arr[i].toString());				
					}
    	            int index = i;  
    	            
    	            for (int j = i + 1; j < arr.length; j++){  
    	            
    	            	if (arr[j].compareTo( arr[index])==1){  
    	                
    	            		index = j;//searching for lowest index  
    	                
    	            	}  
    	            
    	            }  
    	            
    	            Shape smallerNumber = arr[index];   
    	            
    	            arr[index] = arr[i];  
    	            
    	            arr[i] = smallerNumber;  
    	        
    	        } 
    	}
       
    	stop = System.currentTimeMillis();
		timeTaken = stop - start;
		System.out.println("The time talen for sorting is: " + timeTaken + "ms");
    }
}
