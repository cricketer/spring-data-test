package lan.localhost.service.impl;

import lan.localhost.repository.AccountRepository;
import lan.localhost.repository.EventAccountRelationRepository;
import lan.localhost.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private EventAccountRelationRepository eventAccountRelationRepository;

	@Override
	@Transactional
	public void addAccount(String name, String password) {
		throw new NotImplementedException();
	}

}
