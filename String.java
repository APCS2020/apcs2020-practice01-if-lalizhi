public class string{
    public static void main(String[] args) {
        //primitive type: int double boolean char
        /**
         * reference type: String
         * (Integer, Double, Boolean)
         */
        String str;
        str = "Hello";
        //index01234
        System.out.println(str);
        //mehtods: variableName.methodName(parameters);
        System.out.println(str.length());
        String temp = new String(str.substring(0, 1));
        String tmp = str.substring(0, 1);
        System.out.println(temp);
        System.out.println(tmp);
    }
}
