package Main;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DB_UsersTest {

    private DB_Users users;

    //Метод заполняет БД
    @Before
    public void setUp() {
        users = new DB_Users("Пользователи");
        users.addUser("User1",new String("password1").hashCode());
        users.addUser("User2",new String("password2").hashCode());
        users.addUser("User3",new String("password3").hashCode());
        users.addUser("User4",new String("password4").hashCode());
        users.addUser("User5",new String("password5").hashCode());
    }

    @After
    public void clearUser(){
        users = null;
    }

    @Test
    void testSignUpDB_UsersMethod() {
        //"Before" почему-то не запускается сам, поэтому вызываю метод
        setUp();
        //Ищем пользователя по логину и паролю, должно вернуться 3
        int expected = users.signUp("User3",new String("password3").hashCode());
        int actual = 3;
        //Запускаем тест
        Assert.assertEquals(expected, actual);

    }
}