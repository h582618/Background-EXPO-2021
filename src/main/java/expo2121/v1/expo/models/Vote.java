package expo2121.v1.expo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vote {


    @Id
    private String mailAddress;
    private int value;

    public Vote(int value, String mailAddress) {
        this.value = value;
        this.mailAddress = mailAddress;
    }

    public Vote() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMail() {
        return mailAddress;
    }

    public void setMail(String mail) {
        this.mailAddress = mail;
    }
}
