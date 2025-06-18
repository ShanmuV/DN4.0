# Time Complexity Analysis

## Linear Search

Linear Search always searches the list one by one in a sequence <br>
This results in a `O(N)` meaning the time to execute increases with the Input size `N`.

> This is not Efficient for large input sizes.

## Binary Search

Binary Search will remove half of the current array for searching, in every iteration. <br>
This results in a `O(log(N))` meaning the time to execute will get cut in half every iteration.

> This is way more efficient than linear search. But Binary Search requires a **Sorted Array**.

## Conclusion

If the array is already sorted, Binary search is the best option. Linear search is only advised if the input size is small.
