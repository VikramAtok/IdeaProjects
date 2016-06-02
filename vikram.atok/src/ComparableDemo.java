import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Vikram on 6/2/2016.
 */
class Student
{
    String id;
    String name;
    double CGPA;
    int age;

    Student(String id, String name, double CGPA, int age)
    {
        this.id=id;
        this.name=name;
        this.CGPA=CGPA;
        this.age=age;
    }

    public String toString()
    {
        return "\n"+ id +"\t" + name+"\t"+CGPA+"\t"+age;
    }
}

class CompareByID implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        return ((Student)obj1).id.compareTo(((Student)obj2).id);
    }
}

class CompareByCGPA implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        if (((Student)obj1).CGPA-((Student)obj2).CGPA>0)
            return 1;
        else
            return -1;
    }
}
class CompareByName implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        return ((Student)obj1).name.compareTo(((Student)obj2).name);
    }
}

class CompareByAge implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        return ((Student)obj1).age-((Student)obj2).age;
    }
}

public class ComparableDemo {
    public static void main(String[] args)
    {
        Student[] students={new Student("A001","Mahesh",7.6,25),
                            new Student("A002","Suraj",7.9,24),
                            new Student("A003","Harish",8.2,23),
                            new Student("A004","Vishnu",7.1,26)};
        System.out.println(Arrays.toString(students));


        Arrays.sort(students,new CompareByID());
        System.out.println("\n**** Compare by ID ****");
        System.out.println(Arrays.toString(students));

        Arrays.sort(students,new CompareByName());
        System.out.println("\n**** Compare by Name ****");
        System.out.println(Arrays.toString(students));

        Arrays.sort(students,new CompareByCGPA());
        System.out.println("\n**** Compare by CGPA ****");
        System.out.println(Arrays.toString(students));

        Arrays.sort(students,new CompareByAge());
        System.out.println("\n **** Compare by Age ****");
        System.out.println(Arrays.toString(students));
    }
}
