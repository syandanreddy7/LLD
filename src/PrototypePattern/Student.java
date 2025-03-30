package PrototypePattern;

public class Student implements Prototype<Student>{

    private String name;
    private int age;
    private String batch;
    private double avgBatchPSP;
    private double psp;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAvgBatchPSP() {
        return avgBatchPSP;
    }

    public void setAvgBatchPSP(double avgBatchPSP) {
        this.avgBatchPSP = avgBatchPSP;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public Student() {
    }

    public Student(Student st)
    {
        this.name = st.name;
        this.age = st.age;
        this.psp = st.psp;
        this.batch = st.batch;
        this.avgBatchPSP = st.avgBatchPSP;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
