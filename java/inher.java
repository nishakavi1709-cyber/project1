class person {
    public String name;
    protected char sex;
    public int age;
    //Person;
{
        name=null;
        sex='u';
        age='0';
    }
    person(String name,char sex,int age)
    {
        this.name=name;
        this.sex=sex;
        this.age=age;

    }
    String getname()
    {
        return name;
    }
    void Display()
    {
        System.out.println("\t\t name="+name);
        System.out.println("\t\t sex="+sex);
        System.out.println("\t\t age="+age);

    }
    class student extends person{
        private int rollno;
        String branch;
        student(String name,char sec,int age,int rollno,String branch)
        {
            Super(name,sex,age);
            this.rollno=rollno;
            this.branch=branch;
        }
        void Display();{
            System.out.println("\t\t name="+name);
            System.out.println("\t\t rollno="+rollno);
            System.out.println("\t\t sex="+sex);
            System.out.println("\t\t age="+age);
            System.out.println("\t\t branch="+branch);
        }
        void TestMethod()
        {
            sex='M';
            rollno=20;
        }
    }
    class inher{
        public static void main(String args[])
        {
            System.out.println("\t\t INHERITANCE");
            System.out.println("\t\t ***************************");
            Student s1=new Studet("kiruthu",'M',21,1,"COMPUTER SCIENCE");
            Student s1=new Studet("devx",'F',19,2,"SOFTWAR ENGINEERING");
            System.out.println("\n\t\t student 1 details ");
            s1.Display();
            System.out.println("\t\n\t student 2 details");
            s2.Display();
            person p1=new person("reo",'M',45);
            System.out.println("\t\t\n person p1 details");
            p1.Display();


        }
    }
}