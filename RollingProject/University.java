import java.io.IOException;
import java.util.ArrayList;

public class University {

    private ArrayList<Enrolment> enrolment;
    private Student student;
    private final String inputFile = "students.txt";
    private final String outputFile = "output.txt";
    public University(){
        enrolment = new ArrayList<Enrolment>();
    }

    public University(Enrolment enrolment){
        this.enrolment = enrolment;
    }

    public ArrayList<Enrolment> getEnrolment() {
        return enrolment;
    }

    public Enrolment getSpecificEnrolment(int index){
        if(enrolment.size() >= index)
            return enrolment.get(index);
        else
            return null;
    }

    public void readFile() throws IOException {
        FileIO fileIO = new FileIO(inputFile);

        String[] input = fileIO.readFile().split("\n");

        for(int i = 0; i < input.length; i++ ){
            String[] userInput = input[i].split(",");
            Enrolment  enrolment = new Enrolment();
            enrolment.setDate(userInput[0]);

            enrolment.getStudent().setUsername(userInput[1]);
            enrolment.getStudent().setAddress(userInput[2]);
            enrolment.getStudent().setPhoneNumber(userInput[3]);
            enrolment.getStudent().setEmail(userInput[4]);

            String[] unitInput = userInput[5].split(";");

          //  enrolment.setUnitArraySize(unitInput.length);

            for (int j = 0; j < unitInput.length; j++){
                String[] units = unitInput[j].split("-");
             //   enrolment.setSpecificUnit(j, units[0], units[1],Integer.parseInt(units[2]));
            }
        }
    }

    private void writeFile(){
        String temp = "";
        StringBuffer stringBuffer = new StringBuffer(temp);
        for(int x = 0; x < enrolment.size(); x++){
            stringBuffer.append(enrolment.get(x).display());
            temp += enrolment.get(x).display();
        }
        FileIO fileIO = new FileIO(outputFile);
        fileIO.writeFile(stringBuffer.toString());
    }

    public void setEnrolment(ArrayList<Enrolment> enrolment) {
        this.enrolment = enrolment;
    }

    public void display(){
      //  enrolment.display();
        for (int x = 0; x < enrolment.size(); x++)
        {
            System.out.printf(enrolment.get(x).display());
        }
    }

    public void inputStudentDetails(Enrolment enrolment){
        Input input = new Input();
        Validation validation = new Validation();
        boolean proceed = false;

        String name = "";
        do {
            name = input.acceptStringInput("Please enter student name: ");
            if (validation.stringIsBlank(name))
                System.out.println("Student name can not be blank.");
            else
                proceed = true;
        }while (proceed == false);
            proceed = false;

         String address = "";
        do {
            address = input.acceptStringInput("Please enter student address: ");
            if (validation.stringIsBlank(address))
                System.out.println("Address can not be blank.");
            else
                proceed = true;
        }while (proceed == false);
            proceed = false;

            String phoneNo = "";
        do {
            phoneNo = input.acceptStringInput("Please enter Phone number: ");
            if (validation.stringIsBlank(phoneNo))
                System.out.println("Phone Number can not be blank.");
            else
                proceed = true;
        }while (proceed == false);
            proceed = false;

            String email = "";
        do {
            email = input.acceptStringInput("Please enter email address: ");
            if (validation.stringIsBlank(phoneNo))
                System.out.println("Email address can not be blank.");
            else
                proceed = true;
        }while (proceed == false);
            proceed = false;

            enrolment.setStudent(new Student(name, address, phoneNo, email));

        (enrolment.getStudent()).setUsername(name);
        (enrolment.getStudent()).setAddress(address);
        (enrolment.getStudent()).setPhoneNumber(phoneNo);
        (enrolment.getStudent()).setEmail(email);

        enrolment.createStudent(name, address, phoneNo, email);
        System.out.println("Student has been created!");
        }

        public void inputUnitDetails(Enrolment enrolment) {
            Input input = new Input();

            String noOfUnits = input.acceptStringInput("Please enter the number of units to be enrolled");

            int noUnits = Integer.parseInt(noOfUnits);
            enrolment.setUnitSize(noUnits);

            Validation validation = new Validation();
            boolean proceed = false;

            for (int x = 0; x < noUnits; x++) {

                String unitCode = "XYZ";
                do {
                    unitCode = input.acceptStringInput("Please enter the unit code..");
                    if (validation.stringLengthWithinRange(unitCode, 7, 7))
                        proceed = true;
                    else
                        System.out.println("Unit code must be 7 character long");
                } while (proceed == false);
                proceed = false;

                String unitDescription = "Unit description must be within 25 character for this unit test purpose to write a negative test";
                do {
                    unitDescription = input.acceptStringInput("Please enter the unit description..");
                    if (validation.stringLengthWithinRange(unitDescription, 0, 25))
                        proceed = true;
                    else
                        System.out.println("Unit description must be within 25 character");
                } while (proceed == false);
                proceed = false;

                String creditPoints = "";
                do {
                    creditPoints = input.acceptStringInput("Please enter the unit credit points..");
                    if (validation.stringIsBlank(creditPoints))
                        System.out.println("Credit points can not be blank");
                    else
                        proceed = true;
                } while (proceed == false);

                int unitCreditPoints = Integer.parseInt(creditPoints);
                  enrolment.createUnit(x, unitCode, unitDescription, unitCreditPoints);
                System.out.println("Unit successfully enrolled");
            }
        }

        public void startProgram(){


            Input input = new Input();
            String noOfStudents = input.acceptStringInput("Please enter the number of students to be enrolled..");
            int noStudents = Integer.parseInt(noOfStudents);

            for(int x = 0; x < noStudents; x++){
                Enrolment enrolment = new Enrolment();
                inputStudentDetails(enrolment);
                inputUnitDetails(enrolment);
                enrolment.add(enrolment );
            }
        display();
        }
    }


