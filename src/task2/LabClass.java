package task2;


public class LabClass {
    Student[] students = new Student[4];

    public LabClass() {
        students[0] = new Student("name1", 54);
        students[1] = new Student("name2", 11);
        students[2] = new Student("name3", 9);
        students[3] = new Student("name4", 14);
    }

    public Student[] getStudents() {
        return students;
    }

    public Student find(String name){
        if  (name.length() == 0)
            throw new EmptyStringException("Вы ввели пустую строку");
        //System.out.println(students.length);
        for (Student student : students){
            if (student == null)
                throw new StudentNotFoundException("В списке нет студентов");
            if (student.name.equals(name)){
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с таким ФИО не найден");
    }

    @Override
    public String toString() {
        String out = "";
        for (Student student : students){
            out += student.toString() + '\n';
        }
        return out;
    }
}
