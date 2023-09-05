package PendafataranPTSemut79.abstrackclass;

public abstract class Person {
   private String name;
   private String addres;
   private int age;

   public Person(String name, String addres, int age) {
      this.name = name;
      this.addres = addres;
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAddres() {
      return addres;
   }

   public void setAddres(String addres) {
      this.addres = addres;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public abstract void getGajiPerkota();
   public abstract void getGajiSalary();
}
