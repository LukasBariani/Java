import java.util.Date;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Date data = new Date();
        System.out.println(data.toString());
        Locale loc = Locale.getDefault();
        System.out.println (loc.getDisplayLanguage());
        }
    }
