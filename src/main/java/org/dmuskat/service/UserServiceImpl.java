package org.dmuskat.service;

import org.dmuskat.domain.User;

import java.util.List;
/**
 * Created by davidmuskat on 9/17/14.
 */
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public List<User> list() {
        return userRepository.list();
    }

    public void add(User user) {
        userRepository.add(user);
    }

    public User load(Long id) {
        return userRepository.load(id);
    }

    public void update(User user) {
        userRepository.update(user);
    }

    public void delete(Long id) {
        userRepository.delete(id);
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
