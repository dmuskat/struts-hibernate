package org.dmuskat.service;

import org.dmuskat.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * Created by davidmuskat on 9/17/14.
 */

@Transactional(readOnly = false)
public interface UserService {
    public List<User> list();

    @Transactional(readOnly = false)
    public void add(User user);

    public User load(Long id);

    @Transactional(readOnly = false)
    public void update(User user);

    @Transactional(readOnly = false)
    public void delete(Long id);
}
