package greatui.backend.repo;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import greatui.backend.models.RegisteredUser;

@Transactional
@Repository
public interface RegisteredRepo extends CrudRepository<RegisteredUser, Integer>{
	public RegisteredUser save(RegisteredUser ruser);
	public RegisteredUser findByRegisteredid(int id);
}
