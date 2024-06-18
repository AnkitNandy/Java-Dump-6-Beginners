class AlphabeticWord
{
    public static void main(String s)
    {
        System.out.println("Alphabetical order of '"+s+"' is :");
        for (char ch='A';ch<='Z';ch++)
        {
            for (int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if (c == ch || c == (char)(ch+32))
                System.out.print(c);
            }
        }
    }
}