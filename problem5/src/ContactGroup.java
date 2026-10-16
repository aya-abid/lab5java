import java.util.ArrayList;

public class ContactGroup {
    private String name;
    private ArrayList<Contact> contacts;
    private ArrayList<ContactGroup> children;
    private ContactGroup parent;

    public ContactGroup(String name) {
        this.name = name;
        contacts = new ArrayList<>();
        children = new ArrayList<>();
        parent = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addContact(Contact c) {
        contacts.add(c);
    }

    public void addChild(ContactGroup child) {
        if (child == this) {
            return;
        }

        child.parent = this;
        children.add(child);
    }

    // New method

    public String buildGroupReport() {
        StringBuilder sb = new StringBuilder();

        sb.append("Group: ").append(name).append("\n");
        sb.append("Number of contacts: ")
                .append(contacts.size()).append("\n");

        for (Contact c : contacts) {
            sb.append(c.getContactSummary()).append("\n");
        }

        return sb.toString();
    }
}