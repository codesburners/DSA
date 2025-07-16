public class zig_zag_conversion {
    public static void main(String[] args) {
        String str="PAYPALISHIRING";
        int numRows=4;
        String[][] arr=new String[numRows][str.length()];
        int row=0;
        int col=0;
        boolean goingDown=false;
        for(int i=0;i<numRows;i++)
        {
            for(int j=0;j<str.length();j++)
            {
                arr[i][j] = ""; // Initialize the array with null values
            }
        }
        for(int i=0;i<str.length();i++)
        {
            arr[row][col]+=String.valueOf(str.charAt(i));
                    if(row==0 || row==numRows-1)
                    {
                        goingDown = !goingDown;
                    }
            if(goingDown)
            {
                row++;

            }
            else{
                row--;
                col++;
            }
        }





        String result = "";
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(!arr[i][j].isEmpty()) // Check if the cell is not empty
                {
                    result += arr[i][j];
                }
            }
        }
        System.out.println(result);
    }
}
