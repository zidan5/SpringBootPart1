public interface FakeRepoInterface {
    void insertUser(int id, String name,String surname);
    User findUserById(int id);
    void deleteUser(int id);
}
