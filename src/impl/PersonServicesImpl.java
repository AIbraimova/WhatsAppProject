package services.impl;
import java8.classes.Person;
import enums.Gender;
import java8.services.PersonServicesAble;
import java.util.ArrayList;
import java.util.List;
public class PersonServicesImpl implements PersonServicesAble {
    List<Person>people = new ArrayList<>();
    List<Gender>genders = new ArrayList<>();
    @Override
    public String greate(Person people) {
        public String create(Person people) {
            this.people.add(people);
            return "Successful!!!";
        }
        @Override
        public List<Person> getPerson() {
            return people;
        }
        @Override
        public Person getPersonFirsName(String String name;
        name, List<Person> people) {
            for (Person person : people) {
                if(person.getFirstName().equals(name)){
                    return person;
                }
            }
            return null;
        }
        public String getGender(List<Gender>genders){
            this.genders.addAll(genders);
            return "";
        }
        public List<Gender>getGender(){
            return genders;
        };
    }

    @Override
    public String create(Person people) {
        return null;
    }

    @Override
    public List<Person> getPerson() {
        return null;
    }

    @Override
    public Person getPersonFirsName(String name, List<Person> people) {
        return null;
    }
        return genders;
};
}
