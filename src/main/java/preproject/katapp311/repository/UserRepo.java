package preproject.katapp311.repository;



import preproject.katapp311.entity.User;

import java.util.List;

public interface UserRepo {
    List<User> getUsers();
    User getUserById(long id);
    void createUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
}
