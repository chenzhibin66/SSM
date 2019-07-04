package com.nuc.calvin.ssm.service.impl;

import com.nuc.calvin.ssm.entity.BannerCustom;
import com.nuc.calvin.ssm.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Transactional(rollbackFor = Exception.class)
@Service("bannerService")
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerService bannerService;

    @Override
    public List<BannerCustom> queryAllBanner() {
        List<BannerCustom> list = bannerService.queryAllBanner();
        return list;
    }
}
