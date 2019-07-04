package com.nuc.calvin.ssm.service.impl;

import com.nuc.calvin.ssm.dao.RelationCustomDao;
import com.nuc.calvin.ssm.entity.Relation;
import com.nuc.calvin.ssm.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Transactional(rollbackFor = Exception.class)
@Service("relationService")
public class RelationServiceImp implements RelationService {

    @Autowired
    private RelationCustomDao relationCustomDao;

    /**
     * 查询是否相互关注
     *
     * @param relation
     * @return
     */
    @Override
    public List<Relation> queryMutual(Relation relation) {
        return relationCustomDao.queryMutual(relation);
    }

    /**
     * 查询是否单方关注
     *
     * @param relation
     * @return
     */
    @Override
    public List<Relation> queryUnilateral(Relation relation) {
        return relationCustomDao.queryUnilateral(relation);
    }

    /**
     * 关注
     *
     * @param relation
     * @param flag
     */
    @Override
    public void follow(Relation relation, int flag) {
        Relation r = new Relation();
        r.setUserId(relation.getFollowId());
        r.setFollowId(relation.getUserId());
        // 被访问用户已关注我 升级为相互关注 status=2
        if (flag == 2) {
            //插入新纪录，设置为相互关注
            relation.setState(2);
            relationCustomDao.follow(relation);
            // 更新被访问用户关注记录
            r.setState(2);
            relationCustomDao.Status(r);
        } else {
            relation.setState(1);
            relationCustomDao.follow(relation);
        }
    }

    @Override
    public void unFollow(Relation relation, int flag) {
        Relation r = new Relation();
        r.setUserId(relation.getFollowId());
        r.setFollowId(relation.getUserId());
        // 被访问用户已关注我 status=2
        if (flag == 2) {
            // 解除关注
            relationCustomDao.unFollow(relation);
            // 更新被访问用户关注记录 更新状态为1 单方关注
            r.setState(1);
            relationCustomDao.Status(r);
        } else { // 完全陌生 解除关系 status=1
            relationCustomDao.unFollow(relation);
        }
    }

    @Override
    public int queryRelation(Integer userId, Integer followId) {
        // 我--->他
        Relation relation1 = new Relation();
        relation1.setUserId(userId);
        relation1.setFollowId(followId);

        //他---->我
        Relation relation2 = new Relation();
        relation2.setUserId(userId);
        relation2.setFollowId(followId);
        // 相互关注
        List<Relation> mutuaList = relationCustomDao.queryMutual(relation1);
        // 我关注他
        List<Relation> unilateralList1 = relationCustomDao.queryUnilateral(relation1);
        //他关注我
        List<Relation> unilateralList2 = relationCustomDao.queryUnilateral(relation2);
        if (mutuaList.size() != 0) {
            //相互关注（相互关注——关注）
            return 4;
        } else if (unilateralList1.size() != 0) {
            //我关注他  他未关注我（已关注——关注）
            return 3;
        } else if (unilateralList2.size() != 0) {
            // 他关注我 我未关注他 （关注——相互关注）
            return 2;
        } else {
            // 相互未关注 我发起关注（关注——已关注）
            return 1;
        }
    }
}
