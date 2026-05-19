class person {
    public String name;
    protected char sex;
    public int age;

    person() {
        name = null;
        sex = 'u';
        age = 0;
    }

    person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    String getname() {
        return name;
    }

    void Display() {
        System.out.println("\t\t name=" + name);
        System.out.println("\t\t sex=" + sex);
        System.out.println("\t\t age=" + age);
    }
}

class student extends person {
    private int rollno;
    String branch;

    student(String name, char sex, int age, int rollno, String branch) {
        super(name, sex, age);
        this.rollno = rollno;
        this.branch = branch;
    }

    void Display() {
        System.out.println("\t\t name=" + name);
        System.out.println("\t\t rollno=" + rollno);
        System.out.println("\t\t sex=" + sex);
        System.out.println("\t\t age=" + age);
        System.out.println("\t\t branch=" + branch);
    }

    void TestMethod() {
        sex = 'M';        // protected → accessible
        rollno = 20;      // private → accessible inside class
    }
}

class inher1 {
    public static void main(String args[]) {
        System.out.println("\t\t INHERITANCE");
        System.out.println("\t\t ***************************");

        student s1 = new student("kiruthu", 'M', 21, 1, "COMPUTER SCIENCE");
        student s2 = new student("devx", 'F', 19, 2, "SOFTWARE ENGINEERING");

        System.out.println("\n\t\t student 1 details ");
        s1.Display();

        System.out.println("\n\t\t student 2 details");
        s2.Display();

        person p1 = new person("reo", 'M', 45);
        System.out.println("\n\t\t person p1 details");
        p1.Display();
    }
}
