package home;

import io.qameta.allure.Description;
import io.qameta.allure.Flaky;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class StrategyTest extends AbstractTest{


    @Test
    @Owner("Ольга")
    @Flaky
    @Description(value = "тест проверяет стратегии")
    @Link(name = "Ссылка на игру", url = "https://ru.wikipedia.org/wiki/%D0%9F%D0%B0%D1%80%D0%B0%D0%B4%D0%BE%D0%BA%D1%81_%D0%9C%D0%BE%D0%BD%D1%82%D0%B8_%D0%A5%D0%BE%D0%BB%D0%BB%D0%B0")
    void WinStrategyTest() {
        int statisticWin = 0;

        for (int i = 0; i < 1000; ++i) {
            Game game = new Game(Ted, getDoors());
            if (game.round(0).isPrize()) statisticWin++;
            Collections.shuffle(doors);
        }

        Assertions.assertTrue( statisticWin/1000.0 > 0.6);
    }

    @Test
    @Owner("Ольга")
    @Flaky
    @Description(value = "тест проверяет стратегии")
    @Link(name = "Ссылка на игру", url = "https://ru.wikipedia.org/wiki/%D0%9F%D0%B0%D1%80%D0%B0%D0%B4%D0%BE%D0%BA%D1%81_%D0%9C%D0%BE%D0%BD%D1%82%D0%B8_%D0%A5%D0%BE%D0%BB%D0%BB%D0%B0")
    void LoseStrategyTest() {
        int statisticWin = 0;

        for (int i = 0; i < 1000; ++i) {
            Game game = new Game(Fred, getDoors());
            if (game.round(0).isPrize()) statisticWin++;
            Collections.shuffle(doors);
        }

        Assertions.assertTrue( statisticWin/1000.0 < 0.4);
    }

}
