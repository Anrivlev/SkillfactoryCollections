import java.util.Comparator;
import java.util.List;

public class Collections {
    private static <T extends Comparable<T>> int _binarySearch(List<T> a, int fromIndex, int toIndex, T key) {
        int left = fromIndex;
        int right = toIndex - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            T midValue = a.get(mid);

            int compareResult = midValue.compareTo(key);

            if (compareResult < 0)
                left = mid + 1;
            else if (compareResult > 0)
                right = mid - 1;
            else
                return mid;
        }
        return -(left + 1);
    }

    private static <T> int _binarySearch(List<T> a, int fromIndex, int toIndex, T key, Comparator<T> c) {
        int left = fromIndex;
        int right = toIndex - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            T midValue = a.get(mid);

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

    public static <T extends Comparable<T>> int binarySearch(List<T> list, T key) {
        return _binarySearch(list, 0, list.size(), key);
    }

    public static <T> int binarySearch(List<T> list, T key, Comparator<T> c) {
        return _binarySearch(list, 0, list.size(), key, c);
    }
}
