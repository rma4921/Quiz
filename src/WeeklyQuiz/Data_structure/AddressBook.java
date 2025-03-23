package WeeklyQuiz.Data_structure;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("연락처가 추가되었습니다!\n");
        System.out.println("-------------------------------\n");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
            System.out.println("-------------------------------\n");
            return;
        }

        System.out.println("\n===== 저장된 연락처 =====");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
        System.out.println("-------------------------------\n");
    }

    public void searchContact(String name) {
        boolean found = false;
        System.out.println("\n===== 연락처 검색 결과 =====");

        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println(contact);
                found = true;
            }
        }

        if (!found) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
        System.out.println("-------------------------------\n");
    }
}
