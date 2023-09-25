public class Validation {

    private int max;
    private int min;
    public Validation(){

    }

    public boolean stringIsBlank(String value) {
        boolean blank = false;
        if(value.trim().length() == 0)
            blank = true;
        return blank;
    }

    public boolean stringLengthWithinRange(String value, int min, int max){
        boolean withinRange = false;
        if((value.trim().length() >= min) && (value.trim().length() <= max))
            withinRange = true;
        return withinRange;
    }

//    public boolean unitCodeValidation(String value, String s1, String s2){
//
//        s1="ITO";
//        boolean withinRange = false;
//        if((value.trim().startsWith(s1) >= min) && (value.trim().length() <= max))
//            withinRange = true;
//        return withinRange;
//    }
}

