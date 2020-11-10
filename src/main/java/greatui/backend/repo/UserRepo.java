package greatui.backend.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import greatui.backend.models.User;

@Transactional
@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
	public User save(User user);
	public List<User> findAll();
	public User findByUsername(String username);
}
