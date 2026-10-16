public class Contact {
    private String emailAddress;
    private String faxNumber;
    private String name;
    private String primaryContactMethod;

    public Contact(String emailAddress, String faxNumber,
                   String name, String primaryContactMethod) {
        this.emailAddress = emailAddress;
        this.faxNumber = faxNumber;
        this.name = name;
        this.primaryContactMethod = primaryContactMethod;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getName() {
        return name;
    }

    public String getPrimaryContactMethod() {
        return primaryContactMethod;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrimaryContactMethod(String primaryContactMethod) {
        this.primaryContactMethod = primaryContactMethod;
    }

    public String getEmailDomain() {
        int index = emailAddress.indexOf("@");

        if (index == -1) {
            return "";
        }

        return emailAddress.substring(index + 1);
    }

    public String getContactSummary() {
        return "Name: " + name
                + ", Email: " + emailAddress
                + ", Fax: " + faxNumber
                + ", Preferred method: " + primaryContactMethod;
    }
}