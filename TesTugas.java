public class TesTugas {
    public static void main(String[] args) {
        Student student = new Student("Wisam", 15, 33, 99, "Science");
        FullTime fullTimeTeacher = new FullTime("Nara", 26, "Mathematics", 60000, "Department of Math");
        PartTime partTimeTeacher = new PartTime("Atca", 28, "History", 20);

        System.out.println("Student:");
        student.print();
        System.out.println();

        System.out.println("Full-time Teacher:");
        fullTimeTeacher.print();
        System.out.println();

        System.out.println("Part-time Teacher:");
        partTimeTeacher.print();
        partTimeTeacher.setSalary(30);
    }
}


