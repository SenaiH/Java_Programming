package week_8_Java_CodingTask;

public class NUniqueIntgers {
    public static void main(String[] args) {

    }
    public int[ ] Solution(int N ) {
        int[] result = new int[N];
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            result[i] = i;
            sum += i;
        }
        result[N - 1] = -sum;
        return result;
    }
}

/*
Write a function that given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array.
  Example 1:
    N = 4 => the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].

    The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).

  Example 2:
    N = 3 => one of the possible answers is [-1, 0, 1] (but there are many more correct answers).
 */