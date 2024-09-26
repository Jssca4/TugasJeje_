public class PartTime extends Teacher {
    int hoursworked;

    public PartTime (String name, int age, String subject, int hoursworked){
        super(name, age, subject);
        this.hoursworked = hoursworked;

    }

    public void setSalary(int tarifPerJam){
        System.out.println("Salary : " + (hoursworked*tarifPerJam));
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Hours Worked : " + hoursworked);
    }
    
}
