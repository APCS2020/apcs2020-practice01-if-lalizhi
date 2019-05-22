public class string{
    public static void main(String[] args) {
        //primitive type: int double boolean char
        /**
         * reference type: String
         * (Integer, Double, Boolean)
         */
        String str;
        str = "o<- ^_^";
        //index01234
        System.out.println(str);
        //mehtods: variableName.methodName(parameters);
        System.out.println(str.length());
        String temp = new String(str.substring(0, 1));
        String tmp = str.substring(0, 1);
        System.out.println(temp);
        System.out.println(tmp);

        //StringIndexOutOfBoundsException
        //System.out.println("Hello".substring(5, 6));

        //3 str2.indexOf(b)
        String b = "brother";
        String str3 = "  brother this";// -1
        String str2 = "I have a brother.";
        String str1 = "i haveabrother.";
        System.out.println("indexOf str3 " + str3.indexOf(b));
        System.out.println("indexOf str2 " + str2.indexOf(b));
        System.out.println("indexOf str1 " + str1.indexOf(b));
    }
}
