package home;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PlayerTest extends  AbstractTest{

    @Epic(value = "Игрок")
    @Description("Проверка рискованнной стратегии для игрока Ted")
    @Owner("Ольга")
    @Test
    void TedPlayer(){
        Assertions.assertTrue(Ted.getRisk());
    }

    @Epic(value = "Игрок")
    @Description("Проверка не рискованнной стратегии для игрока Fred")
    @Owner("Ольга")
    @Test
    void FredPlayer(){
        Assertions.assertFalse(Fred.getRisk());
    }
}
