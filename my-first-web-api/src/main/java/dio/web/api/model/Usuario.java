package dio.web.api.model;

public class Usuario {

    private Integer id;
    private String login;
    private String passwword;

    public Usuario(String login, String passwword) {
        this.login = login;
        this.passwword = passwword;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswword() {
        return passwword;
    }

    public void setPasswword(String passwword) {
        this.passwword = passwword;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", passwword='" + passwword + '\'' +
                '}';
    }

}
