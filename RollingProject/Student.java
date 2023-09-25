public class Student {
        private String username;
        private String address;
        private String phoneNumber;
        private String email;

        public Student()
        {

            username = "Unknown";
            address = "Unknown";
            phoneNumber = "Unknown";
            email = "Unknown";
        }

        public Student(String newName, String address, String phoneNumber, String email)
        {

            this.username = newName;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public void display()
        {
            System.out.println("Student Name :" + username);
            System.out.println("Student Address :" + address);
            System.out.println("Student Phone Number :" + phoneNumber);
            System.out.println("Student Email Address :" + email);
        }


    public String getAddress()
    {
        return this.address;
    }

    public String getEmail()
    {
        return this.email;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public String getUserName()
        {
            return this.username;
        }

        public void setAddress(String address){
            this.address = address;
        }
        public void setEmail(String email){
            this.email = email;
        }
        public void setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
        }
        public void setUsername(String username){
            this.username = username;
        }
    }

