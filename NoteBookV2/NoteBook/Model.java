package NoteBook;

public class Model {

    private String name;
    private String registeredLogin = "MyName01";
    private String login;
    boolean loginRegistered;


    public void setName (String name) {
        this.name = name;
    }

    public void setLogin (String login) throws LoginAlreadyRegisteredException{
        if (login.equals(registeredLogin)) throw new LoginAlreadyRegisteredException();
        this.login = login;
        loginRegistered = true;
    }

    public String getName () {
        return this.name;
    }

    public String getLogin () {
        return this.login;
    }
}
