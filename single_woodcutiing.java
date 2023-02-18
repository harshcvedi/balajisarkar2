public class Woodcutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int lo = 0;
        int hi = (int)1e9;
        while (lo < hi) {
            int mid = lo + (hi - lo + 1) / 2;
            long total = 0;
            for (int height : heights) {
                if (height > mid) {
                    total += height - mid;
                }
            }
            if (total >= x) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        System.out.println(lo);
    }
}
