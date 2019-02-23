package gedikoglu.emre.mypersonalpage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "t_contact")
public class Contact extends BaseEntity{
	@NotEmpty
	@Column(name = "name")
	private String name;
	@NotEmpty
	@Column(name = "email")
	private String email;
	@NotEmpty
	@Column(name = "message")
	private String message;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", eMail=" + email + ", message=" + message +"]";
	}

}
