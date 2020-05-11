public interface IUserService {
    void addUser(String name,String surname);
    void removeUser(int Id);
    User getUser(int Id);
}
