import java.util.Arrays;

public class KDifference {

    public static int findPair(int [] collection, int mypair, int next, int pairs, int k){
        //avoid ArrayIndexOutOfBoundsException
        if(next < collection.length){
            //if next element is grater than my pair return pairs
            if(collection[next] > mypair){
                return pairs;
            }
            else{
                //if element is equal than my pair then increment and print pair
                if(collection[next] == mypair){
                    pairs ++;
                    System.out.println("{" + (collection[next] -  k )+","+ collection[next] +"}");
                }
                // call my self again
                return findPair(collection, mypair, next + 1, pairs, k);
            }
        }
        //if I am at the end of array return number of pairs.
        return pairs;
    }

    public static int countDifference(int [] collection, int k){
        //First sort array ascending
        Arrays.sort(collection);
        //Number of pairs found
        int pairs = 0;
        //Loop over collection sorted
        for(int counter = 0; counter < collection.length; counter ++){
            pairs += findPair(collection, collection[counter] + k, counter + 1, 0, k);
        }

        return pairs;
    }

    public static void main(String [] args){
        int arr[] = { 2,4,6,8,10,12 };
        int pairs = countDifference(arr, 2);
        
        System.out.println("Number of pairs found : "+pairs);
    }
}