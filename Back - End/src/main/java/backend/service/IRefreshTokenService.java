package backend.service;

import backend.entity.RefreshToken;
import backend.entity.User;

import java.util.Optional;

public interface IRefreshTokenService {
    RefreshToken createRefreshToken(User user);
    RefreshToken verifyExpiration(RefreshToken token);
    Optional<RefreshToken> findByToken(String token);
    void deleteByUser(User user);
}
