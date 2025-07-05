try{
    int res = 10/0;

}catch(ArithmethicException e){
    e.printStackTrace();
}
try{
    int res = 10/0;
}catch(ArithmeticException e){
    System.out.println("Error divided by zero.");
}finally{
    System.out.println("do cleanup!, code, I will always run");
}