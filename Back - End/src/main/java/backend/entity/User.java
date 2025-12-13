package backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    @Column(name = "username", length = 50, nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "department", length = 30, nullable = false)
    private String department;

    @Column(name = "city", length = 50, nullable = false)
    private String city;

    @Column(name = "avatar_url", length = 200)
    private String avtUrl = "/images/cat.png";

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role = Role.user;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private RefreshToken token;

}
