public class FullTime extends Teacher{
    int anualSalary;
    String unit;

    public FullTime(String name, int age, String subject, int anualSalary, String unit){
        super(name, age, subject);
        this.anualSalary = anualSalary;
        this.unit = unit;
        
    }

    @Override
    public void print (){
        super.print();
        System.out.println("Unit : "  + unit);
        System.out.println("Anual Salary : " + anualSalary);

    }

    
}
