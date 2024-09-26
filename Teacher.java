public class Teacher extends Person{
    String subject;

    public Teacher(String name, int age, String subject){
        super (name, age);
        this.subject = subject;
        
    }
        
    
    @Override
    public void print(){
    super.print();
    System.out.println("Subject " + subject);
    }
}
