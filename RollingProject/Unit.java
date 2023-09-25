public class Unit {

    private String unitCode;
    private String unitDescription;
    private int creditPoints;

    public Unit(){
        unitCode="Unknown";
        unitDescription="Unknown";
        creditPoints=0;
    }

    public Unit(String unitCode, String unitDescription, int creditPoints){
        this.unitCode = unitCode;
        this.unitDescription = unitDescription;
        this.creditPoints = creditPoints;
    }

    public void display(){
        System.out.println("Unit code :"+unitCode);
        System.out.println("Unit code :"+unitDescription);
        System.out.println("Unit code :"+creditPoints);
    }

    public int getCreditPoints(){
        return this.creditPoints;
    }

    public String getUnitCode(){
        return this.unitCode;
    }

    public String getUnitDescription(){
        return this.unitDescription;
    }

    public void setCreditPoints(int creditPoints){
        this.creditPoints = creditPoints;
    }
    public void setUnitCode(String unitCode){
        this.unitCode = unitCode;
    }
    public void setUnitDescription(String unitDescription){
        this.unitDescription = unitDescription;
    }

}

