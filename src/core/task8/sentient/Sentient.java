package core.task8.sentient;

abstract public class Sentient {

    private String firstName;
    private String lastName;
    private int old;

    public Sentient(String firstName, String lastName, int old) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.old = old;
    }


    public int getOld() {
        return old;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
