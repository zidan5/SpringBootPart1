import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class User {
    public String name;
    public String surname;
    public int id;

    //    User(){}
    User(String name, String surname, int id){
        this.name = name;
        this.id = id;
        this.surname = surname;
    }
    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setId(int id){
        this.id = id;
    }
    // Getters
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getId(){
        return id;
    }
}
