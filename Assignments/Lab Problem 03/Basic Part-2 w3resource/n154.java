public class n154 {
    public static void main(String[] args) {
        boolean[][] arr = {{true, false, true}, {false, true, false}};
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] == true ? "t " : "f ");
            }
            System.out.println();
        }
    }
}
