package com.yuzu.assetflow.web;

import com.yuzu.assetflow.domain.Asset;
import com.yuzu.assetflow.service.AssetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/assets")
@RequiredArgsConstructor
public class AssetController {
    private final AssetService assetService;

    @GetMapping
    public String listAssets(Model model) {
        List<Asset> assets = assetService.getAllAssets();
        model.addAttribute("assets", assets);
        return "asset_list";
    }

    @GetMapping("/new")
    public String showNewForm(Model model) {
        model.addAttribute("asset", new Asset());
        return "asset_form";
    }

    @PostMapping("/save")
    public String saveAsset(Asset asset) {
        if (asset.getId() == null) {
            assetService.registerAsset(asset);
        } else {
            assetService.updateAsset(asset);
        }
        return "redirect:/assets";
    }
}
