package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.Banner;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface BannerDao {

    /**
     * 根据广告id查询广告
     *
     * @param bannerId
     * @return
     */
    Banner queryBannerById(int bannerId);

    /**
     * 插入一条广告
     * @param banner
     * @return
     */
    int insertBanner(Banner banner);

    /**
     * 更新一条广告
     * @param banner
     * @return
     */
    int updateBanner(Banner banner);

    /**
     * 根据id删除广告
     * @param bannerId
     * @return
     */
    int deleteBanner(int bannerId);
}
