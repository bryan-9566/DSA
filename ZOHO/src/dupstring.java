public class dupstring {
    public static void main(String[] args)
    {
        String s="a1b2c34c3b2cb3a1d";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='a' && c<='z' || c>='A' && c<='Z' )
            {
                int j;
                for(j=0;j<i;j++)
                {
                    if(s.charAt(j)==c)
                    {
                        break;
                    }
                }
                if(j==i)
                {
                    System.out.print(c);
                }
            }

            else if(c>='0' && c<='9')
            {
                int j;
                for(j=i+1;j<s.length();j++)
                {
                    if(s.charAt(j)==c)
                    {
                        break;
                    }
                }
                if(j==s.length())
                {
                    System.out.print(c);
                }
            }
        }

    }
}
