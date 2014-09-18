package org.dmuskat.service;

import org.dmuskat.domain.User;
import java.util.List;
/**
 * Created by davidmuskat on 9/17/14.
 */
public interface UserRepository {
    public List<User> list();

    public void add(User user);

    public User load(Long id);

    public void update(User user);

    public void delete(Long id);
}
