import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static org.junit.Assert.assertEquals;

public class IndustryValidator {
    private static final List<String> expectedIndustries = Arrays.asList(
            "Agriculture","IT" , "Education", "Healthcare", "Unemployed", "Retired", "Other");

    public static boolean areAllIndustriesPresent(List<String> actualIndustries) {
        return expectedIndustries.stream().allMatch(actualIndustries::contains);
    }

    public static void verifyIndustriesInUI() {
//        List<String> industriesFromUI = $$x("Valid selector").texts(); // Getting texts from elements
        List<String> industriesFromUI =List.of("Agriculture","IT", "Education", "Healthcare", "Unemployed", "Retired", "Other");
        assertEquals("Not all industries are present", areAllIndustriesPresent(industriesFromUI));
    }
}
