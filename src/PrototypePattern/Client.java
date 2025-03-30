package PrototypePattern;

public class Client {
    private static void fillUpRegistry(StudentRegistry registry)
    {
        Student mar24LLDEvePrototype = new Student();
        mar24LLDEvePrototype.setBatch("Mar24Eve");
        mar24LLDEvePrototype.setAvgBatchPSP(80.0);
        registry.register(mar24LLDEvePrototype.getBatch(), mar24LLDEvePrototype);

        Student feb24LLDEvePrototype = new Student();
        feb24LLDEvePrototype.setBatch("Feb24Eve");
        feb24LLDEvePrototype.setAvgBatchPSP(75.0);
        registry.register(feb24LLDEvePrototype.getBatch(), feb24LLDEvePrototype);


    }

    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        fillUpRegistry(studentRegistry);

        Student shivam = studentRegistry.get("Mar24Eve").clone();
        shivam.setName("Shivam");
        shivam.setAge(25);
        shivam.setPsp(90.0);

        System.out.println("DEBUG");





    }
}
