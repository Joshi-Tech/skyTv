package utilites;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FakeDetails {
    public static String password(){
        return RandomStringUtils.randomAlphanumeric(8,10);
    }

    public Faker fake(){
        return new Faker();
    }

    public String firstName(){
        return fake().name().firstName();
    }

    public String lastName(){
        return fake().name().lastName();
    }

    public String email(){
        return firstName() + "." + lastName() + "@" + "gmail.com";
    }

    public String cardNumber(){
        return fake().business().creditCardNumber();
    }

    public String cardExpiry(){
        return fake().business().creditCardExpiry();
    }

    public String cardCVV(){
        return fake().address().zipCode().substring(0,3);
    }
    
}
