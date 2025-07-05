class WrapperExample{
    public static void main(String[] args) {
        int num = 10;
        Integer boxed = num;
        int unboxed = boxed;
         String str = "45";
         int strNum = Integer.parseInt(str);
         String str2 = Integer.toString(strNum);
         int max=Integer.max(30, 40);
         boolean isDigit = Character.isDigit("3");
         Double dbl = Double.ParseDouble("353");
    }
}