import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class IndustryValidationTest {
    @Test
    public void checkElementsInDropDawn(){
        assertTrue(IndustryValidator.areAllIndustriesPresent(Arrays.asList(
                "Agriculture","IT" , "Education", "Healthcare", "Unemployed", "Retired", "Other")));
    }
}


