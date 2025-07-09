package basics;

class Student {
    private String name;
    private int age;

    void setName(String newName){
        this.name = newName;
    }
    String getName(){
        return this.name;
    }
    void setAge(int newAge){
        if(newAge>0){
            this.age=newAge;
        }
    }
    int getAge(){
        return this.age;
    }
}
class Test{
    public static void main (String[] args){
        Student s1 = new Student();
        try{
//            s1.name = "Gwen";
        }catch(Exception e){
            s1.setName("Gwen");

        }
    }
}