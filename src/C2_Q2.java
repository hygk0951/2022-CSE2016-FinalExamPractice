class Person2 {
    private String name;
    public Person2(String n) { name = n; }
    public String getName() { return name; }
}
class Undergrad2 extends Person2 {
    private char grade;
    public Undergrad2(String n, char g) {super(n); grade = g;}
    public char getGrade() { return grade; }
}
class Faculty2 extends Person2 {
    private int salary;
    public Faculty2(String n, int s) {super(n); salary = s;}
    public int getSalary() { return salary; }
}

public class C2_Q2 {
    public static int countFaculty(Person2[] people, int money) {
        // fill here!
        int count = 0;
        for(int i=0; i<people.length; i++){
            if(people[i] instanceof Faculty2 && ((Faculty2) people[i]).getSalary() >= money){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Person2[] people = new Person2[10];
        Undergrad2 s1 = new Undergrad2("kim", 'A');
        Undergrad2 s2 = new Undergrad2("lee", 'B');
        Undergrad2 s3 = new Undergrad2("park", 'A');
        Faculty2 f1 = new Faculty2("lee", 100);
        Faculty2 f2 = new Faculty2("kim", 200);
        people[0] = s1; people[1] = s2;
        people[2] = s3; people[3] = f1; people[4] = f2;
        System.out.println(countFaculty(people, 150)); // 1
    }
}
