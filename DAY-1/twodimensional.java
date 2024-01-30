class twodimensional {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int x=a.length;
        int i,j;
        for(i=0;i<x;i++)
        {
            for(j=0;j<x;j++)
            {
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
    }
}