package data;


import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@MappedSuperclass
public class Person {
	
	@Column(name = "Name")
    private String _name;
	
	@Column(name = "Surname")
    private String _surname;
	
	@Column(name = "Age")
    private int _age;

    public Person() {
    	
    }
    
    public Person(String name, String surname, int age){
        _name = name;
        _surname = surname;
        _age = age;
    }

    public String getName() { return _name; }
    public void setName(String n) { _name = n; }
    
    public String getSurname() { return _surname; }
    public void setSurname(String s) { _surname = s; }

    public int getAge() { return _age; }
    public void setAge(int a) { _age = a; }
}