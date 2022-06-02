import java.util.Objects;

public class studentForSetOfCustomClasses implements Comparable<studentForSetOfCustomClasses> {

    String name;//instance variable
    int rollNo;//rollNo is unique for each student

    public studentForSetOfCustomClasses(String name, int rollNo) {//constructor
        this.name = name;//this keyword is used to refer to the current object
        this.rollNo = rollNo;//constructor
    }

    @Override
    public String toString() {//toString method
        return "studentForSetOfCustomClasses{" +//print hashSet
                "name='" + name + '\'' +//print name
                ", rollNo=" + rollNo +//print rollNo
                '}';
    }

    @Override
    public boolean equals(Object o) {//overriding equals method
        if (this == o) return true;//if both objects are same
        if (o == null || getClass() != o.getClass()) return false;//if both objects are not same
        studentForSetOfCustomClasses student = (studentForSetOfCustomClasses) o;//casting
        return rollNo == student.rollNo;//if both objects are same
    }

    @Override //overriding
    public int hashCode() {//overriding
        return Objects.hash(rollNo);//overriding
    }

    @Override//overriding
    public int compareTo(studentForSetOfCustomClasses that) {//overriding
        return this.rollNo - that.rollNo;//overriding
    }
}
