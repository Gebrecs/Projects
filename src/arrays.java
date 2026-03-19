import java.util.Arrays;
import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {

        // calling methods from other classes
        ArrayExamples.basicArrayExamples();
        ArrayExamples.rearrangeExample();
        ArrayExamples.sortAndSearchExample();

        MatrixExamples.twoDArrayExample();
        MatrixExamples.userMatrixExample();


        // call duplicating remover method

        int [] duplicatedArr={1,2,4,4,5,6,7,83,5,6,7,8,9,10,43,45,45,67};
        int [] uniqueArr= MatrixExamples.removeDuplicates(duplicatedArr);

        System.out.println("elements after removing duplicated is " + Arrays.toString(uniqueArr));


        int [] sortedArr={1,4,5,6,77,88,90,98,99,100};
        int target =7;
        int result=binarySearch.binarySearchArr(sortedArr,target);

        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index " + result);
        }
    }
}

class ArrayExamples {

    static void basicArrayExamples() {

        int[] numbers = {1,2,3,4,5};

        System.out.println("Array length: " + numbers.length);

        int counter = 0;

        for(int number : numbers){
            System.out.println("Counter: " + counter++);
            System.out.println(number);
        }
    }

    static void rearrangeExample(){

        int[] nums = {1,2,4,5,6,9,30,34,45};

        int n = nums.length / 2;

        int secondHalfStart = n + (nums.length % 2);

        int[] rearranged = new int[nums.length];

        for(int i = 0; i < n; i++){
            rearranged[2*i] = nums[i];
            rearranged[2*i+1] = nums[secondHalfStart + i];
        }


        // if the size of an array is odd, the middle element is set at the end of rearranged array
        if(nums.length % 2 != 0){
            rearranged[nums.length-1] = nums[n];
        }

        System.out.println("Rearranged array: " + Arrays.toString(rearranged));
    }

    static void sortAndSearchExample(){

        String[] names = {"Gebremariam","Nati","Mandefro","Ezra","Aster"};

        Arrays.sort(names);

        System.out.println("Sorted names: " + Arrays.toString(names));

        System.out.println("Binary search result: "
                + Arrays.binarySearch(names,"Gebremariam")); // binary search returns index of the given key value

        int[] number = {56,67,54,23,78,2,1,4,6};

        int[] copyByReference = number;

        int[] backup = Arrays.copyOf(number, number.length-2); // This is a shallow copy that copies the value, not the reference

        Arrays.sort(number);

        System.out.println("Sorted numbers: " + Arrays.toString(number));

        System.out.println("Reference copy: " + Arrays.toString(copyByReference));

        System.out.println("Backup copy: " + Arrays.toString(backup));
    }
}

class MatrixExamples {

    static void twoDArrayExample(){

        int[][] twoD = new int[4][5];

        int k = 0;

        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                twoD[i][j] = k++;
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(twoD[i][j] + " ");

            }
            System.out.println();

        }
    }

    static void userMatrixExample(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter matrix size:");

        int m = scanner.nextInt();

        int[][] matrix = new int[m][m];

        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print("Enter value for " + i + " " + j + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }


        // method Arrays.deepToString() prints the matrix in a readable format
        // This method works for multiple dimensions arrays or more than or equal to 2D arrays

        System.out.println("Matrix: " + Arrays.deepToString(matrix));

        int sum = 0;

        for(int i=0;i<m;i++){
            sum += matrix[i][i];
        }

        System.out.println("Primary diagonal sum: " + sum);

        for(int i=0;i<m;i++){
            if(i != m-1-i){ // this removes the middle element from being counted twice if the size of the matrix is odd
                sum += matrix[i][m-1-i];
            }
        }

        System.out.println("Secondary diagonal sum: " + sum);

        scanner.close();
    }

    static int[] removeDuplicates(int[] arr) {
        if(arr==null || arr.length==1){
            return arr;
        }
        // if it is more than that we should sort the array

        Arrays.sort(arr);

        // create a temporary array to store the unique elements
        int[] uniqueArr = new int[arr.length];
        int index=0; // index of the unique array

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                uniqueArr[index++]=arr[i];
            }
        }
        // the last element of the array is not checked
        uniqueArr[index++]=arr[arr.length-1];

        // creating a new array that holds a unique element

        int []result= new int [index];
        for(int i=0;i<index;++i){
            result[i]=uniqueArr[i];
        }
        return result;
    }
}

class binarySearch{
    public static int binarySearchArr(int[]sortedArr,int target){
        int low=0;// setting to the first element
        int high=sortedArr.length-1;// setting to the last element of the sorted array
        while(low<=high){
            int mid= low + (low+high)/2;

            if(sortedArr[mid]==target){
                return mid;
            }
            // if mid is less than the target, low will be the next element to mid
            if(sortedArr[mid]<target){
                low=mid+1;

            }else {
                high=mid-1; // if mid is greater than the target high is going to be the next element closer to left from the mid.
            }
        }
        return -1; // return -1 if the target element is not found on the sorted array

    }
}


