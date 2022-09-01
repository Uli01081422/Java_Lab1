import java.util.Objects;

public class User {
    private String name;
    private String surname;

    private String email;

    private int year;

    public User(final String name, final String surname, final int year, final String email) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return year == user.year && name.equals(user.name) && surname.equals(user.surname) && email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, year);
    }

    @Override //перевизначення
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", year=" + year +
                '}';
    }
}
