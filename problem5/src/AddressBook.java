import java.util.ArrayList;

public class AddressBook {
    private String name;
    private ArrayList<Contact> contacts;
    private ArrayList<ContactGroup> groups;
    private Account account;

    public AddressBook(String name, Account account) {
        this.name = name;
        this.account = account;
        contacts = new ArrayList<>();
        groups = new ArrayList<>();
    }

    public Contact getContact() {
        if (contacts.isEmpty()) {
            return null;
        }
        return contacts.get(0);
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public String getName() {
        return name;
    }

    public void insertContact(Contact contact) {
        contacts.add(contact);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGroup(ContactGroup group) {
        groups.add(group);
    }

    // New methods

    public Contact[] getContacts() {
        return contacts.toArray(new Contact[0]);
    }

    public void addContact(Contact c) {
        contacts.add(c);
    }

    public String getSummary() {
        return "Address Book: " + name
                + ", Contacts: " + contacts.size()
                + ", Groups: " + groups.size();
    }

    public Contact findByEmail(String email) {
        for (Contact c : contacts) {
            if (c.getEmailAddress().equalsIgnoreCase(email)) {
                return c;
            }
        }
        return null;
    }
}