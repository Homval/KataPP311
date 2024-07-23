package preproject.katapp311.repository;

import org.springframework.stereotype.Repository;


import jakarta.persistence.*;
import preproject.katapp311.entity.User;
import java.util.List;

@Repository
public class UserRepoImpl implements UserRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getUsers() {
        return em.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User getUserById(long id) {
        return em.find(User.class, id);
    }

    @Override
    public void createUser(User user) {
        em.persist(user);
    }

    @Override
    public void deleteUser(long id) {
        em.remove(em.getReference(User.class, id));
    }

    @Override
    public void updateUser(User user) {
        em.merge(user);
    }
}
