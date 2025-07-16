import java.time.LocalDate;

public class GroupAccount {
    Group group;
    Account account;
    LocalDate joinDate;

    public GroupAccount(Group group, Account account, LocalDate joinDate){
        this.group = group;
        this.account = account;
        this.joinDate = joinDate;
    }
}
