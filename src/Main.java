import com.jaunt.NotFound;
import com.jaunt.ResponseException;

public class Main {

    public static void main(String[] args) throws ResponseException, NotFound {
        M160by2 m160by2=new M160by2();
        m160by2.login("","");
        m160by2.sendSMS("","");
    }
}
