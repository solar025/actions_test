package home;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Тест кейс для тестирования методов порадокса
 */
public class GameTest extends AbstractTest {



    @Test
    @Owner("Ольга")
    void checkNotRiskWin () {
        //given
        Game game = new Game(Fred, doors);
        //when
        Door door = game.round(0);
        //then
        Assertions.assertTrue(door.isPrize());
    }

    @Test
    @Owner("Ольга")
    void checkNotRiskLose() {
        //given
        Game game = new Game(Fred, doors);
        //when
        Door door = game.round(1);
        //then
        Assertions.assertFalse(door.isPrize());
    }

    @Test
    @Owner("Ольга")
    void checkRiskWin () {
        //given
        Game game = new Game(Ted, doors);
        //when
        Door door = game.round(1);
        //then
        Assertions.assertTrue(door.isPrize());
    }

    @Test
    @Owner("Ольга")
    void checkRiskLose () {
        //given
        Game game = new Game(Ted, doors);
        //when
        Door door = game.round(0);
        //then
        Assertions.assertFalse(door.isPrize());
    }
    @Test
    @Owner("Ольга")
    void DoorsRound(){
        Assertions.assertEquals(doors.size(), 3);
        Game game = new Game(Ted, doors);
        game.round(0);
        Assertions.assertEquals(doors.size(), 2);
    }
}
