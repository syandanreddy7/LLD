package BuilderPattern;

public class Student {

    private String name;
    private int age;
    private String univName;
    private double psp;
    private String batch;
    private int gradYear;
    private String phoneNumber;

    public Student(Builder builder)
    {
        //Validations
        if (builder.getAge() < 20)
        {
            throw new RuntimeException("Age shouldn't be less than 20");
        }

        if(builder.getGradYear() > 2023)
        {
            throw new RuntimeException("Grad Year should not be later than 2023");
        }
        //Validations end

        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.gradYear = builder.getGradYear();
        this.univName = builder.getUnivName();

    }

}
