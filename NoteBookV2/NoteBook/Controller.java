package NoteBook;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class Controller implements RegexContainer {
    Model model = new Model();
    View view = new View();
    ResourceBundle rb;

    Controller (Model model, View view){
        model = this.model;
        view = this.view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        chooseLocale (Language);
        model.setName(registerName (sc, (Language.equals("EN") ?REGEX_NAME_LAT :REGEX_NAME_UKR)));
        model.setLogin(registerLogin(sc,REGEX_LOGIN));
        System.out.print(model.getName() + " " + model.getLogin());
    }

    public void chooseLocale (String language) {
        Locale locale = new Locale (language);
        ResourceBundle rb = ResourceBundle.getBundle ("message", locale);
        this.rb = rb;
    }


    public static boolean rightInput (String input, String regex) {
        Pattern pt = Pattern.compile(regex);
        Matcher matcher = pt.matcher(input);
        return matcher.matches();
    }

    public String registerName (Scanner sc, String regex) {
        view.printMessage(rb.getString("input.string.data") + rb.getString("input.first.name.data"));
        String input = sc.next();
        while (!rightInput(input, regex)) {
            view.printMessage(rb.getString("input.wrong.data")+ rb.getString("input.string.data") + rb.getString("input.first.name.data"));
            input = sc.next();
        }
            return input;
        }

    public String registerLogin (Scanner sc, String regex) {
        view.printMessage(rb.getString("input.string.data") + rb.getString("input.login.data"));
        String input = sc.next();
        while (!rightInput(input, regex)) {
            view.printMessage(rb.getString("input.wrong.data")+ rb.getString("input.string.data") + rb.getString("input.login.data"));
            input = sc.next();
        }
        return input;
    }
}

