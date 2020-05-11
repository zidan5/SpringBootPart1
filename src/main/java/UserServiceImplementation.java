import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplementation implements FakeRepoInterface {

    @Autowired
    public FakeRepo fRepo;

    @Override
    public void insertUser(int id, String name, String surname) {
        fRepo.insertUser(id,name,surname);
    }

    @Override
    public User findUserById(int id) {
        return fRepo.findUserById(id);
    }

    @Override
    public void deleteUser(int id) {
         fRepo.deleteUser(id);
    }

}



