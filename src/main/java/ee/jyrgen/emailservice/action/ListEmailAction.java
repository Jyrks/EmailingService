package ee.jyrgen.emailservice.action;

import com.google.common.collect.Lists;
import com.opensymphony.xwork2.ActionSupport;
import ee.jyrgen.emailservice.model.Email;
import ee.jyrgen.emailservice.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListEmailAction extends ActionSupport {

	@Autowired
	private EmailRepository emailRepository;
	private List<Email> listEmail;
	private List<String> listAddress;
	private List<Email> listContent;
	private String address;

	@Override
	public String execute() throws Exception {
		listEmail = Lists.newArrayList(emailRepository.findAll());
		listAddress = emailRepository.findDistinctAddress();
		return SUCCESS;
	}

	public String showSelectedEmails() throws Exception {
		listContent = emailRepository.findByAddress(address);
		return SUCCESS;
	}

	public List<Email> getListEmail() {
		return listEmail;
	}

	public void setListEmail(List<Email> listEmail) {
		this.listEmail = listEmail;
	}

	public List<String> getListAddress() {
		return listAddress;
	}

	public List<Email> getListContent() {
		return listContent;
	}

	public void setListAddress(List<String> listAddress) {
		this.listAddress = listAddress;
	}

	public void setListContent(List<Email> listContent) {
		this.listContent = listContent;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
