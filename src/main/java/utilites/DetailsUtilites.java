package utilites;

import java.util.Random;

public class DetailsUtilites {
    private String title;
    private String firstName;
    private String lastName;
    private String email;
    private String confirmEmail;
    private String password;
    private String confirmPassword;

    public static String getTitle(){
        String [] title= {"Mr","Mrs", "Rev", "Ms","Miss"};
        Random random = new Random();
        random.nextInt(title.length+1);
        return  title[random.nextInt((title.length-2)+1)];
    }

    public static String getFirstName(){
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }


    public static String getLastName(){
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    public static String getEmail(){
        return getFirstName()+"."+ getLastName()+"@gmail.com";
    }

    public static String getPassword(){
        return "asdfg232132";
    }

    public static String getPostCode(){
        return "UB4 8SH";
    }

    public static String address(){
        return "226";
    }

    public static String cardNumber(){
        Random random = new Random(12);
        int number = random.nextInt();
        return "5555737333449955";
    }

    public static String expiry(){
        return "0330";
    }

    public static String cvv(){
        return "343";
    }


}
