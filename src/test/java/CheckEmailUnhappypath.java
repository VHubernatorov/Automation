
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailUnhappypath {

    @DataProvider (name = "Email")
    public static Object[][] dataMetod() {
        return new Object[][]{
                {"ad@gmail.com"},
                {"па@gmail.com"},
                {"парам@gmail.com"},
                {"12@gmail.com"},
                {"mail@gmail.COM"},
                {"mailgooglefinfuncoore@gmail.COM"}
        };
    }

    @Test(dataProvider = "Email")
    public static void checkemailunhappypath(String str) {
        Email e = new Email();
        boolean resul = e.isEmailCorrect(str);
        Assert.assertTrue (resul);

    }
}
