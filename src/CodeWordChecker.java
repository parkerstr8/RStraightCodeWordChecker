public class CodeWordChecker implements StringChecker
{
    private String str1;
    private int x;
    private int y;

    public CodeWordChecker(int x, int y, String str1)
    {
        this.x = x;
        this.y = y;
        this.str1 = str1;
    }
    public CodeWordChecker(String str1)
    {
        this.str1=str1;
        x=6;
        y=20;
    }
       public boolean isValid(String str) {
            if(str.indexOf(this.str1)>=0&&(x<=str.length()&&str.length()<=y))
            {
                return true;
            }

                return false;

        }

}




