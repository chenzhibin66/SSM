package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.Banner;
import com.nuc.calvin.ssm.entity.BannerCustom;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface BannerCustomDao {

    List<BannerCustom> queryAllBanner();
}
