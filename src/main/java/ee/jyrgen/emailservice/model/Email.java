package ee.jyrgen.emailservice.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;


@Entity
@Table(name = "emails")
public class Email {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String address;
	private String content;

	public String getAddress() {
		return address;
	}

	public String getContent() {
		return content;
	}

	public Long getId() {
		return id;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String toString() {
		return address;
	}
}
