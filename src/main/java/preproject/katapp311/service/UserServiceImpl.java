package preproject.katapp311.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import preproject.katapp311.entity.User;
import preproject.katapp311.repository.UserRepo;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepoImpl;

    @Transactional(readOnly = true)
    @Override
    public List<User> getUsers() {
        return userRepoImpl.getUsers();
    }

    @Transactional(readOnly = true)
    @Override
    public User getUserById(long id) {
        return userRepoImpl.getUserById(id);
    }

    @Transactional
    @Override
    public void createUser(User user) {
        userRepoImpl.createUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(long id) {
        userRepoImpl.deleteUser(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userRepoImpl.updateUser(user);
    }
}
