public class Enrolment {

    private String date;
    private Student student;
    private Unit unit[];

    public Enrolment(){
        date = "Unknown";
        student = new Student();
        unit = new Unit[5];
    }

    public Enrolment(String date, Student student, Unit unit[]){
        this.date = date;
        this.student = student;
        this.unit = unit;
    }

    public String display(){

        String value = date + student.toString();
        for(int x = 0; x < unit.length; x++){
            if (unit[x] != null)
                value += unit[x].toString();
        }

        return value;

//        System.out.println("Student admission date: "+date);
//        student.display();
//        unit.display();
    }

    public void createStudent(String name, String address, String phoneNo, String email){
            student = new Student(name,address,phoneNo,email);
    }

    public void createUnit(int index, String unitCode, String unitDescription, int unitCreditPoints){
        if( index < unit.length)
            unit[index] = new Unit(unitCode, unitDescription, unitCreditPoints);
    }
    public String getDate(){
        return this.date;
    }

    public Student getStudent(){
        return this.student;
    }

    public Unit getspecificUnit(int index){
        if(index < unit.length)
            return unit[index];
        return null;
    }

    public Unit[] getUnit(){
        return this.unit;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setSpecificUnit(int index, Unit newUnit){
        if(index < unit.length)
            unit[index] = newUnit;
    }

    public void setAddress(String address){
        student.setAddress(address);
    }

    public void setUnit(Unit[] unit) {
        this.unit = unit;
    }

    public void setUnitSize(int size){
        unit = new Unit[size];
    }

    public int getTotalCreditPoints() {
        Unit unit1 = new Unit();
        int totalCreditPoints = 0;

        for (Unit unit : unit) {
            if (unit != null) {
                totalCreditPoints += unit1.getCreditPoints();
            }
        }

        return totalCreditPoints;
    }

    public void moveLowCreditPoints() {
            int index = 0;

            for (int i = 0; i < unit.length; i++) {
                if (unit[i] != null && unit[i].getCreditPoints() < 6) {
                    Unit temp = unit[i];
                    unit[i] = unit[index];
                    unit[index] = temp;
                    index++;
                }
            }

            for (int i = index; i < unit.length; i++) {
                if (unit[i] != null && unit[i].getCreditPoints() >= 6) {
                    Unit temp = unit[i];
                    int j = i - 1;
                    while (j >= index && unit[j] != null && unit[j].getCreditPoints() >= 6) {
                        unit[j + 1] = unit[j];
                        j--;
                    }
                    unit[j + 1] = temp;
                }
            }
        }
}
