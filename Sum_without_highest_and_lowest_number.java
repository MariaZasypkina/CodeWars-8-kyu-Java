public class Sum_without_highest_and_lowest_number {
    public static void main(String[] args) {
        int[]arr = {6, 2, 1, 8, 10};
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int sum = 0;
for (int i = 0; i < arr.length; i++){
if (arr[i] > min) {
    min = arr[i];
}
if (arr[i] < max) {
    max = arr [i];
}
}
for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
}
       sum = sum - min - max;
        System.out.println(sum);
    }
}

//Task
//Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
//
//The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
//
//Mind the input validation.
//
//Example
//{ 6, 2, 1, 8, 10 } => 16
//{ 1, 1, 11, 2, 3 } => 6