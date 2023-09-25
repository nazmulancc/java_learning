public class EnrolStudent {

       public static void main(String[] args){
                Enrolment enrolment = new Enrolment();
                enrolment.display();
           System.out.println("----------------------------");
           enrolment.setAddress("Updated address goes here");
           enrolment.display();
           System.out.println("-----------------------------");
           Student student = new Student("Nazmul","54 this st","045446596","n.h@email.com");
           Enrolment enrolment1 = new Enrolment("12/12/2022", student,enrolment.getUnit());
           enrolment1.display();
           System.out.println("-----------------------------");
           Enrolment enrolment2 = new Enrolment("23/08/2022",
                   new Student("Ravish","ACT","5446566","r.r@email.com"),
                   new Unit("ITO4212","Java Intro",6));
           enrolment2.display();
       }

}

