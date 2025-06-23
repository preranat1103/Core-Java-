class Stat{

    //static nested class
    static class nested {
        void display(){
            System.out.println("Hello from static nested class");
        }
    }
    public static void main(String[] args) {
        //Create an object of static nested class
        Stat.nested obj=new Stat.nested();
        obj.display();
    }
}
