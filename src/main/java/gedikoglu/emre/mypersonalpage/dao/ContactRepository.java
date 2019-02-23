package gedikoglu.emre.mypersonalpage.dao;

import java.util.List;

import gedikoglu.emre.mypersonalpage.model.Contact;

public interface ContactRepository {
	List<Contact> findAll();

	Contact findByEmail(String email);

	List<Contact> findByName(String name);

	void create(Contact contact);

	Contact update(Contact contact);

	void delete(String email);
}
