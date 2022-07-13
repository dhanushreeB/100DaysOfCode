public class Day1_Sort012 {
    public static void sort012(int[] a) {
        int n = a.length;
        int count0 = 0;
        int count2 = 0;
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            switch (i) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;

            }
        }
        for (int i = 0; i < count0; i++)
            a[i] = 0;

        // Putting the 1's in the array after the 0's.
        for (int i = count0; i < (count0 + count1); i++)
            a[i] = 1;

        // Putting the 2's in the array after the 1's
        for (int i = (count0 + count1); i < n; i++)
            a[i] = 2;
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);

    }

    public static void main(String[] args) {
        int[] a = { 2, 1, 0, 0, 0, 0, 1, 2, 0, 2, 1 };
        sort012(a);
    }
}
