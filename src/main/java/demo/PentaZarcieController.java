package demo;

/**
 * Created by krukat on 2015-09-22.
 */
import com.pentacomp.pentazarcie.model.Group;
import com.pentacomp.pentazarcie.model.Place;
import com.pentacomp.pentazarcie.model.User;
import com.pentacomp.pentazarcie.repo.GroupRepository;
import com.pentacomp.pentazarcie.repo.PlaceRepository;
import com.pentacomp.pentazarcie.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class PentaZarcieController {

	@Autowired
	private PlaceRepository placeRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private GroupRepository groupRepository;

	@RequestMapping("/places")
    public List<Place> getPlaces() {
        return placeRepository.findAll();
    }

	@RequestMapping("/groups")
	public List<Group> getGroups() {
		return groupRepository.findAll();
	}

	@RequestMapping("/users")
	public List<User> getUsers() {
		return userRepository.findAll();
}
}
