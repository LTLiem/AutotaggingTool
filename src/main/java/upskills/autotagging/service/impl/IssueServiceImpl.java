package upskills.autotagging.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import upskills.autotagging.dao.IssueDao;
import upskills.autotagging.model.Issue;
import upskills.autotagging.service.IssueService;

@Service
public class IssueServiceImpl implements IssueService {

	@Autowired
	private IssueDao issueDao;
	
	@Transactional
	public List<Issue> getAllIssue() {
		return issueDao.getAll();
	}

	@Transactional
	public void addNewIssue(Issue issue) {
		issueDao.create(issue);
	}

	@Transactional
	public void updateIssue(Issue issue) {
		issueDao.update(issue);

	}

	@Transactional
	public void deleteIssue(int issueId) {
		issueDao.deleteById(issueId);

	}

	/**
	 * 
	 */
	/*	@Transactional
	public Boolean isIssueExist(Issue issue) {
		
	}*/

}
