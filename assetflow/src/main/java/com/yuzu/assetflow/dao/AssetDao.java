package com.yuzu.assetflow.dao;

import com.yuzu.assetflow.domain.Asset;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.Delete;
import org.seasar.doma.boot.ConfigAutowireable;
import java.util.List;
import java.util.Optional;

@Dao
@ConfigAutowireable
public interface AssetDao {
    @Select
    Optional<Asset> selectById(Long id);

    @Select
    List<Asset> selectAll();

    @Insert
    int insert(Asset asset);

    @Update
    int update(Asset asset);

    @Delete
    int delete(Asset asset);
}
