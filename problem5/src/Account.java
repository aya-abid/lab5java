import java.util.ArrayList;

public class Account {
    private String emailAddress;
    private String name;
    private ArrayList<AddressBook> addressBooks;

    public Account(String emailAddress, String name) {
        this.emailAddress = emailAddress;
        this.name = name;
        addressBooks = new ArrayList<>();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressBook[] getAddressBooks() {
        return addressBooks.toArray(new AddressBook[0]);
    }

    public void addAddressBook(AddressBook book) {
        addressBooks.add(book);
    }

    public void printAllContactDomains() {
        for (AddressBook book : addressBooks) {
            for (Contact c : book.getContacts()) {
                System.out.println(c.getEmailDomain());
            }
        }
    }

    public String getFullName() {
        return name.trim().replaceAll("\\s+", " ");
    }
}