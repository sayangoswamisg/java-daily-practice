/*
* In java, if the second object is not completely dependent on 
* the first object then the relationship is called as  
* Agregation
*/
// Loose coupling
// we achive it using helper methods


class Engine{
     void checkEngine()
     {
        System.out.println("Engine Started");
     }
}

class Car{
      void checkCar()
      {
        System.out.println("Car Started");
      }
      Engine e;
      // Helper Method
      public void createEngine(){
        e = new Engine();
      }
}

public class Agregation{
      public static void main(String[] args)
      {
         Car c = new Car();
         c.checkCar();
         c.createEngine();
         c.e.checkEngine();
         
      }
}
 
