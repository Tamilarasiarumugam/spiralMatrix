package assignments;

public class SpiralMatrix {
	
	public static int[][] spiralMatrix(int n)
	{
		int matrix[][]=new int[n][n];
		int left=0,right=n-1,top=0,bottom=n-1;
		int num=1;
		while(num<=n*n)
		{
			for(int i=left;i<=right;i++)
			{
				matrix[top][i]=num++;
			}
			top++;
			for(int i=top;i<=bottom;i++)
			{
				matrix[i][right]=num++;
			}
			right--;
			for(int i=right;i>=left;i--)
			{
				matrix[bottom][i]=num++;
			}
			bottom--;
			for(int i=bottom;i>=top;i--)
			{
				matrix[i][left]=num++;
			}
			left++;
		}
		return matrix;
	}
	
	public static void printMatrix(int matrix[][])
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		int num=5;
		int[][] matrix=spiralMatrix(num);
		printMatrix(matrix);
	}

}

