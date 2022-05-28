package curs1;

public class Pair {
    public static void main(String[] args) {
        int [] arr = {3, 2, -3, -2, 3, 0};

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] + arr[j] == 0)

                    count++;
        System.out.println(count);
    }

}
