package PrototypePattern;

public class Client {
    private static void fillUpRegistry(StudentRegistry registry)
    {
        Student mar24LLDEvePrototype = new Student();
        mar24LLDEvePrototype.setBatch("Mar24Eve");
        mar24LLDEvePrototype.setAvgBatchPSP(80.0);
        registry.register("Mar24Eve", mar24LLDEvePrototype);

        Student feb24LLDEvePrototype = new Student();
        feb24LLDEvePrototype.setBatch("Feb24Eve");
        feb24LLDEvePrototype.setAvgBatchPSP(75.0);
        registry.register("Feb24Eve", feb24LLDEvePrototype);


        IntelligentStudent mar24LLDEveISPrototype = new IntelligentStudent();
        mar24LLDEveISPrototype.setBatch("Mar24Eve");
        mar24LLDEveISPrototype.setAvgBatchPSP(90.0);
        mar24LLDEveISPrototype.setIq(90);
        registry.register("Mar24EveIS",mar24LLDEveISPrototype);

    }

    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        fillUpRegistry(studentRegistry);

        Student shivam = studentRegistry.get("Mar24Eve").clone();
        shivam.setName("Shivam");
        shivam.setAge(25);
        shivam.setPsp(70.0);

        Student abhishek = studentRegistry.get("Mar24EveIS").clone();
        abhishek.setName("Abhishek");
        abhishek.setAge(26);
        abhishek.setPsp(90.0);

        System.out.println("DEBUG");

    }
}
