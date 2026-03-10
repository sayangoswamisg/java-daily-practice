/*
 When one class having multiple parents but in * multiple level then it is called as multilevel * inheritance 
*/




class SuperParent{
    int a;
    SuperParent(int a)
    {
       this.a = a;
       System.out.println("SuperParent...." + a);

    }
}

class Parent extends SuperParent{
    int b;
    Parent(int a, int b)
    {
       super(a);
       this.b = b;
       System.out.println("Parent...." + b);

    }
}

class Child extends Parent{
    int c;
    Child(int a, int b, int c)
    {
       super(a, b);
       this.c = c;
       System.out.println("Child...." + c);
    }
}

class MultilevelInheritance{
    public static void main(String[] args){
       Child c = new Child(1, 2, 3);
    }
}
