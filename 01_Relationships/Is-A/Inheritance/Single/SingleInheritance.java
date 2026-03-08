/* 
*When one object is aquaring *properties of another object then it *is called as Inheritance or IS-A *Relationship 
*/

/* 
*one class is sharing property with *another class in single level then it *is call 
*/

class Parent{
    int a;
    int b;
    void checkParnent(){
       System.out.println("Parent");
    }

    Parent(int a, int b){
       this.a = a;
       this.b = b;
       System.out.println("Parent");
    }
}

class Child extends Parent{
    int c;
    void check()
    {
       System.out.println("Child");
    }
    Child(int a, int b, int c){
       super(a, b);
       this.c = c;
       System.out.println("Child");
    }
}

class SingleInheritance{
    public static void main(String[] args){
       Child c = new Child(1, 2, 3);
       
       System.out.println(c.a);
     }
}

