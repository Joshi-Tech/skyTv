package utilites;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;

/*@Builder
@NoArgsConstructor
@AllArgsConstructor*/
public class FakeDetails {
    private String firstName;
    private String lastName;
    private String password;

    public static String getPassword(){
      return   RandomStringUtils.randomAlphanumeric(10,2);
    }

}
