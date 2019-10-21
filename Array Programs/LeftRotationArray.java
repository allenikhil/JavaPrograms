public class LeftRotationArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] array = new int[n];

        for(int i=0; i<n;i++) {
            array[(i+n-d)%n] = scanner.nextInt();
        }
        for(int i=0; i<n;i++) {
            System.out.print(array[i] + " ");
        }  
        scanner.close();
    }
}
