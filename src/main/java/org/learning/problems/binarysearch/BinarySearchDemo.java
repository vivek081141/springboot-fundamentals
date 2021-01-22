package org.learning.problems.binarysearch;

public class BinarySearchDemo {


  public static void main(String[] args) {
    int[] a = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
    int element = 23;
    int x = binarySearch(a, 0, a.length-1, element);
    if (x == -1) {
      System.out.println("Element is not found");
      return;
    }

    System.out.println(a[x] + " element is present in array at " + x + " position");
  }

  private static int binarySearch(int[] a, int l, int r, int element) {
    if (l > r) {
      return -1;
    }

    int mid = (l + r) / 2;

    if (element == a[mid]) {
      return mid;
    } else if (element > a[mid]) {
      //element is present in the right side
      l = mid + 1;
      binarySearch(a, l, r, element);
    } else if (element < a[mid]) {
      //element is present in the left side
      r = mid - 1;
      binarySearch(a, l, r, element);
    }

    //never execute
    return -1;
  }

}
