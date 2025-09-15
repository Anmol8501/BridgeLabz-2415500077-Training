class FootballTeam {
    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }
    public static double mean(int[] arr) {
        return sum(arr) / (double) arr.length;
    }
    public static int min(int[] arr) {
        int m = arr[0];
        for (int x : arr) if (x < m) m = x;
        return m;
    }
    public static int max(int[] arr) {
        int m = arr[0];
        for (int x : arr) if (x > m) m = x;
        return m;
    }
    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) heights[i] = 150 + (int)(Math.random() * 101);
        System.out.println("Shortest: " + min(heights));
        System.out.println("Tallest: " + max(heights));
        System.out.println("Mean: " + mean(heights));
    }
}
