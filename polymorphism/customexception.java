package errors;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}

class Test2{
    static int age = 3;

    static void setAge(int age) throws InvalidAgeException{
        if(age>0){
            throw new InvalidAgeException("Age must be Positive number");
        }
    }

    public static void main(String[] args){
        try{
            setAge(-3);
        }
        catch(InvalidAgeException e)
    {
        e.printStackTrace();
    }
    }
}