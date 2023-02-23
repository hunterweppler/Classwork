public class Student {
    private String name;
    private int ID;
    private static int nextID = 3;
    public Student(String name, int ID){
        this.name = name;
        this.ID = ID;
    }
    public Student(String name){
        this.name = name;
        this.ID = nextID;
        nextID++;
    }
    public String toString(){return this.name + this.ID+ " " + nextID;}
    public void change_name(String newName){
        name = newName;
    }
    public boolean precedesById(Student student1, Student student2){
        boolean result = student1.ID < student2.ID;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Student Max1 = new Student(" Max1 ",141);
        Student Max2 = new Student( "Max2 ",444);
        Max1.precedesById(Max1,Max2);
    }
}