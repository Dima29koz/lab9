package task2;

public class Student implements Comparable<Student>{
    String name;
    int average_mark;

    public Student(String name, int average_mark) {
        this.name = name;
        this.average_mark = average_mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", average_mark=" + this.average_mark +
                '}';
    }
    public int compareTo(Student student){
        if (this.average_mark == student.average_mark) {
            return 0;
        } else if (this.average_mark < student.average_mark) {
            return -1;
        } else {
            return 1;
        }
    }
}
