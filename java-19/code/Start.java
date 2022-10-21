class Start {
    public static void main(String[] data) {
        int[][] m = { { 3, 4, 2, 1, 7 },
                      { 2, 8, 5, 4, 9, 3, 7 },
                      { 1, 3, 1, 7, 6 } };
        
//        for (int r = 0; r < m.length; r++) {
//            System.out.println(m[r][2]);
//        }
        // write code to print the middle row
        for (int c = 0; c < m[1].length; c++)  {
            System.out.println(m[1][c] + " ");
        }
    }
}
