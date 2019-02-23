package gedikoglu.emre.mypersonalpage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import gedikoglu.emre.mypersonalpage.dao.ContactRepository;
import gedikoglu.emre.mypersonalpage.exception.ContactNotFoundException;
import gedikoglu.emre.mypersonalpage.model.Contact;

@Service
@Transactional(rollbackFor = Exception.class)
public class MyPersonalPageServiceImpl implements MyPersonalPageService{

	private ContactRepository contactRepository;

	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	public void setContactRepository(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Contact> findContacts() {
		return contactRepository.findAll();
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Contact> findContacts(String name) {
		return contactRepository.findByName(name);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Contact findContact(String email) throws ContactNotFoundException {
		Contact contact = contactRepository.findByEmail(email);
		
		if(contact == null) {
			throw new ContactNotFoundException("Contact not found with email: " + email);
		}
		
		return contact;
	}

	@Override
	public void createContact(Contact contact) {
		contactRepository.create(contact);
		
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom("egedikoglu1@gmail.com");
		msg.setTo(contact.getEmail());
		msg.setSubject("Contact created!");
		msg.setText("I got your message. I will contact you as soon as possible. - Emre Gedikoğlu");
		
		mailSender.send(msg);
	}

	@Override
	public void updateContact(Contact contact) {
		contactRepository.update(contact);
	}

	@Override
	public void deleteContact(String email) {
		contactRepository.delete(email);
	}

}
