class parent{
    public void display()
    {
        System.out.println("parent class");
    }
}

class child extends parent{
    public void display1()
    {
        System.out.println("child class");
    }
}

class p16{
    public static void main(String[] args) {
        child c=new child();
        c.display1();
        c.display();
    }
}