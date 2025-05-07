package formattingfactory;

public class NameFormatter {

    //Minimal info (first and last name only)
    public static String format(String firstName, String lastName){
        return lastName + ", " + firstName;
    }

    //Full detail
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix ){
//        return lastName + ", " + prefix + ". " + firstName + " " + middleName + ", " + suffix;
        StringBuilder name = new StringBuilder();
        name.append(lastName + ", ");

        if (!prefix.isEmpty()){
            name.append(prefix + ". ");
        }

        name.append(firstName);

        if(!middleName.isEmpty()){
            name.append(" " + middleName);
        }

        if (!suffix.isEmpty()){
            name.append(", " + suffix);
        }

        return name.toString();
    }

    //fULL STRING NEEDING PARSING
    public static String format(String fullName){
        //DR. Mel B Johnson, PHD
        //Firstly split by comma
        String prefixToLastname = fullName.split(",");
    }
}
