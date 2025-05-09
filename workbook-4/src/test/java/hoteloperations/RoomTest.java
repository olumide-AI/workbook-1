package hoteloperations;

import static org.junit.jupiter.api.Assertions.*;

import hoteloperations.Room;
import org.junit.jupiter.api.Test;


public class RoomTest {
    @Test
    //MethodName_StateUnderTest_ExpectedBehavior
    public void CheckIn_Room0ccupiedAndDirty_True(){
        Room roomTest = new Room(1,true,true,100);
        //Act
        roomTest.checkIn();
        //Assertion
        assertTrue(roomTest.isOccupied());
        assertTrue(roomTest.isDirty());
    }
    @Test
    //MethodName_StateUnderTest_ExpectedBehavior
    public void CheckIn_Room0ccupiedAndNotDirty_False(){
        Room roomTest = new Room(1,false,true,100);
        //Act
        roomTest.checkIn();
        //Assertion
        assertTrue(roomTest.isOccupied());
        assertTrue(roomTest.isDirty());
    }
    @Test
    public void testRoomCheckIn(){
        Room roomTest = new Room(1,false,true,100);
        //Act
        roomTest.checkIn();
        //Assertion
        assertTrue(roomTest.isDirty());


    }
    @Test
    public void testRoomCheckInDirtRoom(){
        Room roomTest = new Room(1,false,false,100);
        //Act
        roomTest.checkIn();
        //Assertion
        assertTrue(roomTest.isDirty());
        assertFalse(roomTest.isOccupied());
    }


}
