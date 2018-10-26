package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private final StringProperty _firtName = new SimpleStringProperty();

    public final StringProperty getFirstNameProperty(){
        return _firtName;
    }

    public final String getFirstName(){
        return _firtName.get();
    }

    public final void setFirstName(final String firstName){
        _firtName.set(firstName);
    }

    private final StringProperty _lastName = new SimpleStringProperty();

    public final StringProperty getLastNameProperty(){
        return _lastName;
    }

    public final String getLastName(){
        return _lastName.get();
    }

    public final void setLastName(final String lastName){
        _lastName.set(lastName);
    }

    private final StringProperty _email = new SimpleStringProperty();

    public final StringProperty getEMAILProperty(){
        return _email;
    }

    public final String getEmail(){
        return _email.get();
    }

    public final void setEmail(String email){
        _email.set(email);
    }

    public Person(String firstName, String lastName, String email){
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }
}
