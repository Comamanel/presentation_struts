package be.ucm.register.actions;

import be.ucm.register.models.Person;
import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {
    private static final long serialVersionUID = 1L;

    private Person personBean;

    @Override
    public String execute(){
        //call Service class to store personBean's state in database

        return SUCCESS;
    }
    public void validate(){
        if (personBean.getFirstName().length() == 0) {
            addFieldError("personBean.firstName", "First name is required.");
        }

        if (personBean.getEmail().length() == 0) {
            addFieldError("personBean.email", "Email is required.");
        }

        if (personBean.getAge() < 18) {
            addFieldError("personBean.age", "Age is required and must be 18 or older");
        }
    }

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person person) {
        personBean = person;
    }
}
