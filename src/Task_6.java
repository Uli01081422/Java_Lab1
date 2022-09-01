public class Task_6  {
    public static void main(final String[] args) {
        final User userNumberOne = new User("Andriy", "Perun", 26, "andriy.perun@gmail.com");
        final User userNumberTwo = new User ("Uliana", "Perun", 18, "uliana.perun@gmail.com");

        System.out.println("hashcode first user :" + userNumberOne.hashCode());
        System.out.println("hashcode second user :" + userNumberTwo.hashCode());

        System.out.println("Equals " + userNumberOne.toString() + userNumberOne.equals(userNumberTwo) + userNumberTwo.toString());
    }
}