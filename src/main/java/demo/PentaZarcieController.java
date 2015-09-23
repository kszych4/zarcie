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
import com.pentacomp.pentazarcie.service.GroupService;
import com.pentacomp.pentazarcie.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@RestController
public class PentaZarcieController {

//	@Autowired
//	public PentaZarcieController(PlaceService placeService, GroupService groupService) {
//		this.placeService = placeService;
//		this.groupService = groupService;
//	}

	@Autowired
	private PlaceRepository placeRepository;

	@Autowired
	private GroupRepository groupRepository;

	private PlaceService placeService;

	private GroupService groupService;

	@RequestMapping(value="/places", method = RequestMethod.GET)
	public List<Place> getPlaces() {
//        return placeService.getAllPlaces();
		return placeRepository.findAll();
    }

	@RequestMapping(value="/place", method = RequestMethod.POST)
	public @ResponseBody Place addPlace(@RequestBody Place place) {
//		return placeService.addPlace(place);
		return placeRepository.insert(place);
	}

	@RequestMapping(value="/place/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void removePlace(@PathVariable("id") String placeId) {
//		placeService.deletePlace(placeId);
		placeRepository.delete(placeId);
	}

	@RequestMapping(value="/groups", method = RequestMethod.GET)
	public List<Group> getGroups() {
//		return groupService.getAllGroups();
		return groupRepository.findAll();
	}

}
