public class FirstBadVersion {
    public static int firstBadVersion(int n, int bad) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid, bad)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static boolean isBadVersion(int version, int bad) {
        return version >= bad;
    }

    public static void main(String[] args) {
        int n = 5;
        int bad = 4;
        int badVersion = firstBadVersion(n, bad);
        System.out.println("First bad version: " + badVersion);
    }
}
