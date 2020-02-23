
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {

    @DataProvider (name = "Email")
    public static Object[][] dataMetod() {
        return new Object[][]{
                {"Ad1@gmail.com"},
                {"weq51@gmail.com"},
                {"fluffy_2003@gmail.com"},
                {"behappy!@gmail.com"},
                {"behappy!@12l.com"}
        };
    }

    @Test(dataProvider = "Email")
    public static void checkemailunhappypath(String str) {
        Email e = new Email();
        boolean resul = e.isEmailCorrect(str);
        Assert.assertTrue (resul);

    }
}



