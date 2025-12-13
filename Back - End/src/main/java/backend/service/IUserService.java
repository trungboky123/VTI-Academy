package backend.service;

import backend.dto.request.CreateRequest;
import backend.dto.request.LoginRequest;
import backend.dto.request.UpdateRequest;
import backend.dto.response.UserReponse;
import backend.entity.User;
import org.springframework.data.domain.Page;

public interface IUserService {
    Page<UserReponse> getAllUsers(int page, int size, String sortBy, String sortDir);
    User isLogin(LoginRequest request);
    void delete(Integer id);
    void register(CreateRequest request);
    void create(CreateRequest request);
    UserReponse findById(Integer id);
    void update(UpdateRequest request);
    User findByUsername(String username);
}
