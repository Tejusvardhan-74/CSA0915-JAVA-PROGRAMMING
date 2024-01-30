class exception {
    public static void main(String[] args) {
        try
        {
            int a,b,c;
            a=9;
            b=0;
            c=a/b;
            System.out.println(c);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("get well soon");
        }
    }