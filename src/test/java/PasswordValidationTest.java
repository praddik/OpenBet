import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordValidationTest {

    @Test
    public void minimalSymbol(){
        assertFalse(PasswordValidator.isValidPassword("Test1!"));
    }

    @Test
    public void specificSymbol(){
        assertFalse(PasswordValidator.isValidPassword("password#&$"));
    }

    @Test
    public void validPass(){
        assertTrue(PasswordValidator.isValidPassword("ValidPassword1@"));
    }
}
