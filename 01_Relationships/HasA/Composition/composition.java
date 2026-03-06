//one object is getting created along with another object 



class Engine{
     // properties
     void starting()
     {
         System.out.println("Engine Started");
     }
}

class car{
     // non-static single line initializer
     Engine e = new Engine();
}

class composition{
     public static void main(String[] args)
     {
          car c = new car();
          c.e.starting();
     }
}
