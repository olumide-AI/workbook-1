package hoteloperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    //MethodName_StateUnderTest_ExpectedBehavior
    @Test
    public void TestPunchIn_NormalValue_True(){
        Employee employee = new Employee(39,40,"IT", "Olu","123");
        double clockInTime = employee.punchIn(9); //9AM
        assertEquals(9,clockInTime);
    }
    @Test
    public void TestPunchIn_negativeValue_True(){
        Employee employee = new Employee(39,40,"IT", "Olu","123");
        double clockInTime = employee.punchIn(-9); //9AM
        assertEquals(-9,clockInTime);
    }
}
