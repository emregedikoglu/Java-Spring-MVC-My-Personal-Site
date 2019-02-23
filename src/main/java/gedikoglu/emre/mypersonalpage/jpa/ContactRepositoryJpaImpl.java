package gedikoglu.emre.mypersonalpage.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import gedikoglu.emre.mypersonalpage.dao.ContactRepository;
import gedikoglu.emre.mypersonalpage.model.Contact;

@Repository("contactRepository")
public class ContactRepositoryJpaImpl implements ContactRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Contact> findAll() {
		return entityManager.createQuery("from Contact", Contact.class).getResultList();
	}

	@Override
	public Contact findByEmail(String email) {
		return entityManager.find(Contact.class, email);
	}

	@Override
	public List<Contact> findByName(String name) {
		return entityManager.createQuery("from Contact where name = :name", Contact.class).setParameter("name", name).getResultList();
	}

	@Override
	public void create(Contact contact) {
		entityManager.merge(contact);
	}

	@Override
	public Contact update(Contact contact) {
		return entityManager.merge(contact);
	}

	@Override
	public void delete(String email) {
		entityManager.remove(entityManager.getReference(Contact.class, email));
	}

}
