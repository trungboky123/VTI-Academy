package Sources;

import java.time.LocalDate;

public class GroupAccount {
    public Group group;
    public Account account;
    public LocalDate joinDate;

    public GroupAccount(Group group, Account account, LocalDate joinDate){
        this.group = group;
        this.account = account;
        this.joinDate = joinDate;
    }
}
