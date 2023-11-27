import javax.xml.namespace.QName;

public class Student {
    private String name;
    private int age;



    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student []student=new Student[2];
        student[0]=new Student("yt",21);
        student[1]=new Student("as",20) ;

        for (int i =0; i< student.length;i++){
            System.out.println("name student :" + student[i].getName());
            System.out.println("age student :" + student[i].getAge());
            System.out.println();
        }
    }
}
