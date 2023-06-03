package day_17_CustomClass;

public class Dog {
   public String name;
   public String breed;
   public String size;
   public char gender;
   public String color;
   public int age;

   public void setInfo(String name,String breed,char gender,int age,String size,String color){
      this.name=name; //this keyword is used->calling the instance variable name.
      this.breed=breed;
      this.gender=gender;
      this.age=age;
      this.age=age;
      this.color=color;

   } //this method can help us to set all the information of the dog at once
public void eat(){
   System.out.println(name + " is eating");
}
public void drink(){
   System.out.println(name + " is drinking water");
}

   public String toString() {
      return "Dog{" +
              "name='" + name + '\'' +
              ", breed='" + breed + '\'' +
              ", size='" + size + '\'' +
              ", gender=" + gender +
              ", color='" + color + '\'' +
              ", age=" + age +
              '}';
   }
}
