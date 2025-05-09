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
        if (nameSplit.length < 2){
            return "invalid format: missing suffix";
        }
        String prefixToLastname = nameSplit[0].trim();
        String suffix = nameSplit[1].trim();



        String[] prefixSplit = prefixToLastname.split("\\., 2");
        String prefix;
        String firstnameToLastname;

        if (prefixSplit.length > 1){
            prefix = prefixSplit[0].trim();
            firstnameToLastname = prefixSplit[1].trim();
        }
        else {
            prefix = "";
            firstnameToLastname = prefixSplit[0].trim();
        }

        String[] nameParts = firstnameToLastname.split(" ");
        String firstName = "";
        String middleName = "";
        String lastName = "";

        if (nameParts.length >= 1){
            firstName = nameParts[0].trim();
        }
        if (nameParts.length >=3){
            middleName = nameParts[1].trim();
            lastName = nameParts[2].trim();
        } else if (nameParts.length ==2) {
            lastName = nameParts[1].trim();
        }

        //Build string using string buildet
        StringBuilder formattedName = new StringBuilder();

        if (!prefix.isEmpty()){
            formattedName.append(prefix).append(", ");
        }
        formattedName.append(firstName);

        if (!middleName.isEmpty()){
            formattedName.append(" ").append(middleName);
        }

        if (!lastName.isEmpty()){
            formattedName.append(" ").append(lastName);
        }
        formattedName.append(", ").append(suffix);
        return formattedName.toString();


    }

    public static void main(String[] args) {
        String personName = "Mel B Johnson";
        System.out.println(format(personName));

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
