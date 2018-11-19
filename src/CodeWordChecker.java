public class CodeWordChecker implements StringChecker
{
    private String str1;
    private int x=6;
    private int y=20;
    public CodeWordChecker(String str1, int x, int y)
    {
        this.x = x;
        this.y = y;
        this.str1 = str1;
    }
       public boolean isValid(String str) {
            if(str1.indexOf(str)<0)
            {
                return false;
            }
            if(x<str1.length()&&str1.length()<y)
            {
                return true;
            }
            return false;
        }

}




