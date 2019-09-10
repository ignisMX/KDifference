# K Difference algorithm

Given an integer array and a positive integer k, count all distinct pairs with difference equal to k.

## Examples


```bash
Input: arr[] = {1, 5, 3, 4, 2}, k = 3
Output: 2
There are 2 pairs with difference 3, the pairs are {1, 4} and {5, 2} 
```

```bash
Input: arr[] = {8, 12, 16, 4, 0, 20}, k = 4
Output: 5
There are 5 pairs with difference 4, the pairs are {0, 4}, {4, 8}, 
{8, 12}, {12, 16} and {16, 20} 
```

## Usage
You should run this with java 8 or higher

```bashc
javac KDifference.java
java KDifference
```

## Solution Overview
First sort array ascending (You can use heap sort or some method of java O(n log n)).

Calculate pair of current number, looking for in array and add one in pairs counter when find it.

Return number of pairs found.

## License
[MIT](https://choosealicense.com/licenses/mit/)