package model;

import javafx.beans.Observable;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;

public class DataModel {
    private final ObservableList<Person> _personList = FXCollections.observableArrayList(person -> new
            Observable[]{person.getFirstNameProperty(), person.getLastNameProperty()});

    private final ObjectProperty<Person> _currentPerson = new SimpleObjectProperty<>(null);

    public ObjectProperty<Person> getCurrentPersonProperty(){
        return _currentPerson;
    }

    public final Person getCurrentPerson(){
        return getCurrentPersonProperty().get();
    }

    public final void setCurrentPerson(Person person){
        _currentPerson.set(person);
    }

    public ObservableList<Person> getPersonList(){
        return _personList;
    }

    public void loadData(File file){
        _personList.setAll(
                new Person("Jacob", "Smith", "jacob.smith@example.com"),
                new Person("Isabella", "Johnson","isabella.johnson@example.com"),
                new Person("Ethan", "Williams", "ethan.williams@example.com"),
                new Person("Emma", "Jones", "emma.jones@example.com"),
                new Person("Michael", "Brown", "michael.brown@example.com")
        );
    }

    public void saveData(File file){}
}
