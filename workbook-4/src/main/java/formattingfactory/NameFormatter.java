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
        String[] nameSplit = fullName.split(",");
        String prefixToLastname = nameSplit[0];
        String suffix = nameSplit[1];

        String[] prefixToLastnameSplit = prefixToLastname.split("//.");
        String prefix = prefixToLastnameSplit[0];
        String firstnameToLastname = prefixToLastnameSplit[1];

        String[] splitBySpace = firstnameToLastname.split(" ");
        String firstName = splitBySpace[0];
        String middleName = splitBySpace[1];
        String lastName = splitBySpace[2];

        return prefix + ". " + firstName + " " + middleName + " " + lastName + ", " + suffix;

    }
//    public static String format(String fullName) {
//        String prefix = "";
//        String firstName = "";
//        String middleName = "";
//        String lastName = "";
//        String suffix = "";
//
//        // Step 1: Split full name by comma
//        String[] parts = fullName.split(",");
//
//        // Handle suffix if it exists
//        if (parts.length > 1) {
//            suffix = parts[1].trim();
//        }
//
//        // Step 2: Break left side into words
//        String[] words = parts[0].trim().split(" ");
//
//        int start = 0;
//
//        // Step 3: Check for prefix (ends with ".")
//        if (words[0].endsWith(".")) {
//            prefix = words[0];
//            start = 1; // shift forward
//        }
//
//        // Step 4: Extract remaining parts based on count
//        if ((words.length - start) == 2) {
//            firstName = words[start];
//            lastName = words[start + 1];
//        } else if ((words.length - start) == 3) {
//            firstName = words[start];
//            middleName = words[start + 1];
//            lastName = words[start + 2];
//        }
//
//        // Step 5: Build formatted output
//        StringBuilder name = new StringBuilder();
//        name.append(lastName).append(", ");
//
//        if (!prefix.isEmpty()) {
//            name.append(prefix).append(" ");
//        }
//
//        name.append(firstName);
//
//        if (!middleName.isEmpty()) {
//            name.append(" ").append(middleName);
//        }
//
//        if (!suffix.isEmpty()) {
//            name.append(", ").append(suffix);
//        }
//
//        return name.toString();
//    }

}
