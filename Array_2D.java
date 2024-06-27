public class Array_2D{
    public static void main(String[] args) {
        int arr[][] = new int[3][4];// int[3][4] signifies that it has 3 rows and 4 columns


        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++){
                arr[i][j] = (int)(Math.random() * 10);
            }
            // we used (int) in front of math.random because it gives double values so we 
            // typecasted it to get the value in int
            // math.random is used to get some random values and we multiply it by 10 so 
            // we get single digit number (math.random provides value in decimals)
        }


        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // this is an enhance for loop 
        for(int n[] : arr)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();

        }
    }
    
}
