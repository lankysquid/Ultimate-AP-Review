import java.util.Arrays;
//All of the logic for the merge sort can be seen here

public class Sort {

  // This method is just to print out arrays easier
  public static String toStringArray(int[] elements) {
    String re = "[";
    for (int i = 0; i < elements.length; i++) {
      re += elements[i];
      if (i < elements.length - 1) {
        re += ", ";
      }
    }
    return re + "]";
  }

  // Merge Sort for int arrays
  public static void mergeSort(int[] elements) {
    int[] temp = new int[elements.length];
    mergeSortHelp(elements, 0, elements.length - 1, temp);
  }

  public static void mergeSortHelp(int[] elements, int from, int to, int[] temp) {
    if (from < to) {
      int mid = (from + to) / 2;
      mergeSortHelp(elements, from, mid, temp);
      mergeSortHelp(elements, mid + 1, to, temp);
      merge(elements, from, mid, to, temp);
    }
  }

  public static void merge(int[] elements, int from, int mid, int to, int[] temp) {
    int firstHalf = from;
    int secondHalf = mid + 1;
    int index = from;

    while (firstHalf <= mid && secondHalf <= to) {
      if (elements[firstHalf] < elements[secondHalf]) {
        temp[index] = elements[firstHalf];
        firstHalf++;
      } else {
        temp[index] = elements[secondHalf];
        secondHalf++;
      }
      index++;
    }
    // puts the remaining elements, which would already be sorted
    while (firstHalf <= mid) {
      temp[index] = elements[firstHalf];
      firstHalf++;
      index++;
    }
    // puts the remaining elements, which would already be sorted
    while (secondHalf <= to) {
      temp[index] = elements[secondHalf];
      secondHalf++;
      index++;
    }

    // Now putting the sorted elements in temp into elements
    for (int i = from; i <= to; i++) {
      elements[i] = temp[i];
    }
  }
}