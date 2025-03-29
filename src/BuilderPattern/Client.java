package BuilderPattern;

public class Client {

    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.setName("Ram");
        builder.setAge(24);
        builder.setBatch("MWF Evening");
        builder.setPsp(90.00);
        builder.setGradYear(2022);
        builder.setUnivName("Scaler School of Tech");
        builder.setPhoneNumber("1234567890");

        Student s1 = new Student(builder);

        System.out.println("DEBUG");

    }
}
