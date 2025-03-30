package PrototypePattern;

public class IntelligentStudent extends Student{

    private int iq;

    public IntelligentStudent() {
    }

    public IntelligentStudent(IntelligentStudent IS)
    {
        super(IS);
        this.iq = IS.getIq();
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Student clone()
    {
        return new IntelligentStudent(this);
    }
}
