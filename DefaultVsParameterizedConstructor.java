class Human {
    private int age;
    private String name;

    public Human() { //default
        age = 12;
        name = "John";
        }

    // public Human(int a, String n) { //Parameterized Constructor
    //     age = a;
    //     name = n;
        
    // }    

       public Human(int age, String name) { //Parameterized Constructor
        this.age = age;
        this.name = name;
        
    }    
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

   
}

public class DefaultVsParameterizedConstructor {
    public static void main(String[] args) {

        Human obj = new Human();
        Human obj1 = new Human(18, "Navin");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj.getAge());


        // obj.setAge(30);
        // obj.setName("Reddy");

        // System.out.println(obj.getName() + " : " + obj.getAge());
        
    }
    
}
