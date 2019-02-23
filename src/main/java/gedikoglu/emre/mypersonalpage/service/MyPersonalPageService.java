package gedikoglu.emre.mypersonalpage.service;

import java.util.List;

import gedikoglu.emre.mypersonalpage.exception.ContactNotFoundException;
import gedikoglu.emre.mypersonalpage.model.Contact;

public interface MyPersonalPageService {
	List<Contact> findContacts();
	List<Contact> findContacts(String name);
	Contact findContact(String email) throws ContactNotFoundException;
	void createContact(Contact contact);
	void updateContact(Contact contact);
	void deleteContact(String email);
}
