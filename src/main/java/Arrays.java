import java.util.Comparator;

public class Arrays {
    private static void checkRange(int length, int fromIndex, int toIndex) {
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException(
                    String.format("fromIndex (%s) > toIndex (%s)", fromIndex, toIndex));
        }
        if (fromIndex < 0) {
            throw new ArrayIndexOutOfBoundsException(fromIndex);
        }
        if (toIndex > length) {
            throw new ArrayIndexOutOfBoundsException(toIndex);
        }
    }

    private static int _binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        int left = fromIndex;
        int right = toIndex - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            byte midValue = a[mid];

            if (midValue < key)
                left = mid + 1;
            else if (midValue > key)
                right = mid - 1;
            else
                return mid;
        }
        return -(left + 1);
    }

    private static int _binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        int left = fromIndex;
        int right = toIndex - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            short midValue = a[mid];

            if (midValue < key)
                left = mid + 1;
            else if (midValue > key)
                right = mid - 1;
            else
                return mid;
        }
        return -(left + 1);
    }

    private static int _binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int left = fromIndex;
        int right = toIndex - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = a[mid];

            if (midValue < key)
                left = mid + 1;
            else if (midValue > key)
                right = mid - 1;
            else
                return mid;
        }
        return -(left + 1);
    }

    private static int _binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        int left = fromIndex;
        int right = toIndex - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            long midValue = a[mid];

            if (midValue < key)
                left = mid + 1;
            else if (midValue > key)
                right = mid - 1;
            else
                return mid;
        }
        return -(left + 1);
    }

    private static int _binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        int left = fromIndex;
        int right = toIndex - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            float midValue = a[mid];

            if (midValue < key)
                left = mid + 1;
            else if (midValue > key)
                right = mid - 1;
            else
                return mid;
        }
        return -(left + 1);
    }

    private static int _binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        int left = fromIndex;
        int right = toIndex - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            double midValue = a[mid];

            if (midValue < key)
                left = mid + 1;
            else if (midValue > key)
                right = mid - 1;
            else
                return mid;
        }
        return -(left + 1);
    }

    private static int _binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        int left = fromIndex;
        int right = toIndex - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            char midValue = a[mid];

            if (midValue < key)
                left = mid + 1;
            else if (midValue > key)
                right = mid - 1;
            else
                return mid;
        }
        return -(left + 1);
    }

    private static <T> int _binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<T> c) {
        int left = fromIndex;
        int right = toIndex - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            T midValue = a[mid];

            int compareResult = c.compare(midValue, key);

            if (compareResult < 0)
                left = mid + 1;
            else if (compareResult > 0)
                right = mid - 1;
            else
                return mid;
        }
        return -(left + 1);
    }

    public static int binarySearch(byte[] a, byte key) {
        return _binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        checkRange(a.length, fromIndex, toIndex);
        return _binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(char[] a, char key) {
        return _binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        checkRange(a.length, fromIndex, toIndex);
        return _binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(double[] a, double key) {
        return _binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        checkRange(a.length, fromIndex, toIndex);
        return _binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(float[] a, float key) {
        return _binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        checkRange(a.length, fromIndex, toIndex);
        return _binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(int[] a, int key) {
        return _binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        checkRange(a.length, fromIndex, toIndex);
        return _binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(long[] a, long key) {
        return _binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        checkRange(a.length, fromIndex, toIndex);
        return _binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(short[] a, short key) {
        return _binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        checkRange(a.length, fromIndex, toIndex);
        return _binarySearch(a, fromIndex, toIndex, key);
    }

    public static <T> int binarySearch(T[] a, T key, Comparator<T> c) {
        return _binarySearch(a, 0, a.length, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<T> c) {
        checkRange(a.length, fromIndex, toIndex);
        return _binarySearch(a, fromIndex, toIndex, key, c);
    }
}