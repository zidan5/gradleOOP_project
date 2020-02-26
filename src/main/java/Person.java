import java.util.ArrayList;
import java.util.Arrays;

public class Person {

    private String name; // attributes
    private String gender;// attributes
    private int age;// attributes
    private String[] Interests;// attributes


    Person(String name, String gender, int age, String [] interests){ // Overloaded constructor
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.Interests = interests;
    }
    public String Hello(){
        String LastInterest = Interests[Interests.length - 1];
        ArrayList<String> interests = new ArrayList<String>();

        for(int i =0; i <Interests.length; i++){
            if(i < (Interests.length -1))
                interests.add(Interests[i]);
        }
        String ManipInterests =  interests.toString();
        ManipInterests =ManipInterests.replaceAll("[\\[\\]]","");
      //  ManipInterests = ManipInterests.substring(1,ManipInterests.length() - 1);
        return  "Hello, my name is "+name+ " and i am "+age+" years old and my interests are "+
        ManipInterests +" and "+ LastInterest;

    }
    public static void main(String[] args){
        Person Ryan = new Person("Ryan","Male",30,new String[] {"being a hardarse ","agile ","ssd hard drives "});
        String greeting =  Ryan.Hello();
        System.out.println(greeting);
    }
}