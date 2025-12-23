package com.yuzu.assetflow.dao;

import com.yuzu.assetflow.domain.User;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import java.util.Optional;

@Dao
@ConfigAutowireable
public interface UserDao {
    @Select
    Optional<User> selectById(Long id);

    @Select
    Optional<User> selectByUsername(String username);

    @Insert
    int insert(User user);
}
