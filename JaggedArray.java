public class JaggedArray {
    public static void main(String[] args) {
        int Arr[][] = new int[3][];
        Arr[0] = new int[3];
        Arr[1] = new int[4];
        Arr[2] = new int[2];

        for(int i = 0 ; i < Arr.length; i++){
            for (int j = 0 ; j < Arr[i].length ; j++){
                Arr[i][j] = (int)(Math.random() * 10);
            }

        }
        for(int n[] : Arr)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();

        }

    }
}
