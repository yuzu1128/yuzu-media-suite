package com.yuzu.assetflow.domain;

import lombok.Data;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Column;
import org.seasar.doma.Metamodel;
import java.time.LocalDateTime;

@Entity(metamodel = @Metamodel)
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @Column(name = "password_hash")
    private String passwordHash;

    private String role;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
