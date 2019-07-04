package com.nuc.calvin.ssm.service;

import com.nuc.calvin.ssm.entity.BannerCustom;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface BannerService {
    /**
     * 查询所有广告
     *
     * @return
     */
    List<BannerCustom> queryAllBanner();
}
