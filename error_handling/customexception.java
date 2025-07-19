package error_handling;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}


class Test2{
   static int age = 10;

    static void setAge(int n) throws InvalidAgeException{
        if(n<0){
            throw new InvalidAgeException("Age must be Positive number");
        }

        age = n;
    }

    public static void main(String[] args){
        try{
            setAge(-3);
        }
        catch(InvalidAgeException e){
            e.printStackTrace();
        }

    }
}