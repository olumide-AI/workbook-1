package formattingfactory;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NameFormatterTest {
    @Test
    //MethodName_StateUnderTest_ExpectedBehavior
    public void testFormatWithFirstandLastNameUsingBothNames_Pass (){
       String result = NameFormatter.format("Olu", "Kolawole");
       assertEquals("Kolawole, Olu",result);
    }

    @Test
    //MethodName_StateUnderTest_ExpectedBehavior
    public void testFormat_FirstAndLastName_AllLowerCase (){
        String result = NameFormatter.format("Olu", "Kolawole");
        assertNotEquals("kolawole, olu",result);
    }
    @Test
    //MethodName_StateUnderTest_ExpectedBehavior
    public void testFormat_FirstAndLastName_Nocomma (){
        String result = NameFormatter.format("Olu", "Kolawole");
        assertNotEquals("Kolawole Olu",result);
    }
}
