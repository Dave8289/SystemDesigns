package CreationalDP.PrototypeDesignP;

public class Student {
    private String name;
    private int rollNo;
    private double averageBatchPSP;
    private double PSP;

    Student() {
    };

    Student(Student st) {
        this.name = st.name;
        this.rollNo = st.rollNo;
        this.averageBatchPSP = st.averageBatchPSP;
        this.PSP = st.PSP;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setAverageBatchPSP(double averageBatchPSP) {
        this.averageBatchPSP = averageBatchPSP;
    }

    public void setPSP(double pSP) {
        PSP = pSP;
    }

}
