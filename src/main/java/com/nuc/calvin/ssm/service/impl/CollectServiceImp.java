package com.nuc.calvin.ssm.service.impl;

import com.nuc.calvin.ssm.dao.CollectionCustomDao;
import com.nuc.calvin.ssm.entity.CollectCustom;
import com.nuc.calvin.ssm.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Transactional(rollbackFor = Exception.class)
@Service("collectService")
public class CollectServiceImp implements CollectService {

    @Autowired
    private CollectionCustomDao collectionCustomDao;

    /**
     * 收藏
     *
     * @param collectCustom
     */
    @Override
    public void collect(CollectCustom collectCustom) {
        collectionCustomDao.collect(collectCustom);
    }

    @Override
    public void unCollect(CollectCustom collectCustom) {
        collectionCustomDao.uncollect(collectCustom);
    }

    /**
     * 是否收藏 1——是 0——否
     *
     * @param userId
     * @param articleId
     * @return
     */
    @Override
    public int isCollect(Integer userId, Integer articleId) {
        CollectCustom collect = new CollectCustom();
        collect.setUserId(userId);
        collect.setArticleId(articleId);
        List<CollectCustom> collectList = collectionCustomDao.isCollect(collect);
        if (collectList.size() != 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public List<CollectCustom> queryMyCollection(Integer userId) {
        List<CollectCustom> list = collectionCustomDao.queryAllCollection(userId);
        return list;
    }
}
