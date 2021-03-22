package pl.zzpj2021.solid.isp.contactbook.solution;


public class InterfaceSegregationPrinciple {

    public InterfaceSegregationPrinciple() {
    }

    public static void main(String[] args) {

        InterfaceSegregationPrinciple interfaceSegregationPrinciple = new InterfaceSegregationPrinciple();
        interfaceSegregationPrinciple.contactPeople();

    }

    public void contactPeople() {

        Contact contact = new Contact("Jan Kowalski", "Kielce", "jan.kowalski@gmail.com", "83744-23434");
        contact.sendMessage(contact, "promocja", "tanio dzisiaj!");
        contact.makeCall(contact);
    }
}
