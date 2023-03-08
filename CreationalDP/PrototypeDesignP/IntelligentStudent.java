package CreationalDP.PrototypeDesignP;

class IntelligentStudent extends Student {
    int AverageAwards;

    IntelligentStudent() {
    };

    IntelligentStudent(IntelligentStudent is) {
        super(is);
        this.AverageAwards = is.AverageAwards;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}