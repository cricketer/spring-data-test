package lan.localhost.service.impl;

import lan.localhost.repository.EventAccountRelationRepository;
import lan.localhost.repository.EventRepository;
import lan.localhost.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Service("eventService")
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository eventRepository;

	@Autowired
	private EventAccountRelationRepository eventAccountRelationRepository;

	@Override
	@Transactional
	public void addEvent(String title, String location) {
		throw new NotImplementedException();
	}

}
