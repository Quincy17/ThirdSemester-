public class EncapDemo {
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        if(newAge >30){
            age=30;
        }else if(newAge<18){
            age=18;
        }
        else{
            age=newAge;
        }
    }
}