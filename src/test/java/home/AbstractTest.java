package home;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractTest {
    static Player Ted;
    static Player Fred;
    static List<Door> doors;


    @BeforeAll
    static void init() {
        Ted = new Player("Ted", true);
        Fred = new Player("Fred", false);
    }

    @BeforeEach
    void initDoors () {
        doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
    }

    static List<Door> getDoors() {
        List<Door> doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
        Collections.shuffle(doors);
        return doors;
    }
}
