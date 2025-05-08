package hoteloperations;

import static org.junit.jupiter.api.Assertions.*;

import hoteloperations.Room;
import org.junit.jupiter.api.Test;


public class RoomTest {
    @Test
    public void testRoomCheckOut(){
        Room roomTest = new Room(1,false,true,100);
        //Act
        roomTest.checkOut();
        //Assertion
        assertFalse(roomTest.isDirty());


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
