package Assignments.Assignment_Lesson_4.Service;

import Assignments.Assignment_Lesson_4.Entity.Account;
import Assignments.Assignment_Lesson_4.Repository.AccountRepository;
import Assignments.Assignment_Lesson_4.Repository.IAccountRepository;
import java.util.List;

public class AccountService implements IAccountService{
    private final IAccountRepository accountRepository;

    public AccountService() {
        accountRepository = new AccountRepository();
    }

    @Override
    public void create(Account account) {
        accountRepository.create(account);
    }

    @Override
    public List<Account> getAccountsHavingHighestSalary() {
        return accountRepository.getAccountsHavingHighestSalary();
    }
}
