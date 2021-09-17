package Main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateBaseTest {

    private DateBase db = new DateBase("Тестовая база данных");

    @Before
    public void setUp() {

        db.addCol("Имя");
        db.addRow();
        db.addRowValue(db.getId(),0,"Данил");
        db.addRow();
        db.addRowValue(db.getId(),0,"Максим");
        db.addRow();
        db.addRowValue(db.getId(),0,"Дмитрий");

    }

    @Test
    void testSearchDateBaseMethod() {
        setUp();
        int expected = db.search(0,"Максим");
        int actual = 2;
        //Запускаем тест
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testGetIdDateBaseMethod() {
        setUp();
        //Вызываем метод getId, который возвращает количество пользователей в БД
        int expected = db.getId();
        int actual = 3;
        //Запускаем тест
        Assert.assertEquals(expected,actual);
    }
}