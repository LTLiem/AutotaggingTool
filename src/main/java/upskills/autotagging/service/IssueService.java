package upskills.autotagging.service;

import java.util.List;
import upskills.autotagging.model.Issue;

public interface IssueService {
	
	public List<Issue> getAllIssue();
	public void addNewIssue(Issue issue);
	public void updateIssue(Issue issue);
	public void deleteIssue(int issueId);
	//public Boolean isIssueExist(Issue issue);
	
}
