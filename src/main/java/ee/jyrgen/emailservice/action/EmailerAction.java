package ee.jyrgen.emailservice.action;

import com.opensymphony.xwork2.ActionSupport;
import ee.jyrgen.emailservice.model.Email;
import ee.jyrgen.emailservice.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class EmailerAction extends ActionSupport{

	private final static Logger LOGGER = Logger.getLogger(ListEmailAction.class.getName());

	@Autowired
	private EmailRepository emailRepository;
	private String address;
	private String content;

	@Override
	public String execute() throws Exception {
		Email email = new Email();
		email.setAddress(address);
		email.setContent(content);
		emailRepository.save(email);
		LOGGER.info("Saved email with address: " + address);
		LOGGER.info("Content: " + content);
		return SUCCESS;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAddress() {
		return address;
	}

	public String getContent() {
		return content;
	}

}
