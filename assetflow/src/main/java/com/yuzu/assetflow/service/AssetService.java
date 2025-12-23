package com.yuzu.assetflow.service;

import com.yuzu.assetflow.dao.AssetDao;
import com.yuzu.assetflow.domain.Asset;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AssetService {
    private final AssetDao assetDao;

    public List<Asset> getAllAssets() {
        return assetDao.selectAll();
    }

    public Asset getAssetById(Long id) {
        return assetDao.selectById(id).orElseThrow(() -> new RuntimeException("Asset not found"));
    }

    public void registerAsset(Asset asset) {
        asset.setCreatedAt(LocalDateTime.now());
        asset.setUpdatedAt(LocalDateTime.now());
        assetDao.insert(asset);
    }

    public void updateAsset(Asset asset) {
        asset.setUpdatedAt(LocalDateTime.now());
        assetDao.update(asset);
    }
}
