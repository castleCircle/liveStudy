package weeks4.homework1;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        String personalKey = "~~~~~~";
        final GitHub gitHub = new GitHubBuilder().withOAuthToken(personalKey).build();
        final GHRepository repository = gitHub.getRepository("whiteship/live-study");
        final List<GHIssue> issues = repository.getIssues(GHIssueState.ALL);


        final Map<String,Double> users = new HashMap<>();

        for(GHIssue issue : issues){
            List<GHIssueComment> comments = issue.getComments();
            for(GHIssueComment comment : comments){
                final String login = comment.getUser().getLogin();
                users.put(login,users.getOrDefault(login,0.0) + 1);
            }
        }

        for(Map.Entry<String,Double> user: users.entrySet()) {
            System.out.println("사용자 : " + user.getKey() + ", 참석률 : " + user.getValue()/18 );
        }

    }
}
