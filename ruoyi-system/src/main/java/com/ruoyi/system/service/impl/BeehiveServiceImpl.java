package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BeehiveMapper;
import com.ruoyi.system.domain.Beehive;
import com.ruoyi.system.service.IBeehiveService;

/**
 * 蜂箱管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-04-12
 */
@Service
public class BeehiveServiceImpl implements IBeehiveService 
{
    @Autowired
    private BeehiveMapper beehiveMapper;

    /**
     * 查询蜂箱管理
     * 
     * @param beehiveId 蜂箱管理主键
     * @return 蜂箱管理
     */
    @Override
    public Beehive selectBeehiveByBeehiveId(Long beehiveId)
    {
        return beehiveMapper.selectBeehiveByBeehiveId(beehiveId);
    }

    /**
     * 查询蜂箱管理列表
     * 
     * @param beehive 蜂箱管理
     * @return 蜂箱管理
     */
    @Override
    public List<Beehive> selectBeehiveList(Beehive beehive)
    {
        return beehiveMapper.selectBeehiveList(beehive);
    }

    /**
     * 新增蜂箱管理
     * 
     * @param beehive 蜂箱管理
     * @return 结果
     */
    @Override
    public int insertBeehive(Beehive beehive)
    {
        return beehiveMapper.insertBeehive(beehive);
    }

    /**
     * 修改蜂箱管理
     * 
     * @param beehive 蜂箱管理
     * @return 结果
     */
    @Override
    public int updateBeehive(Beehive beehive)
    {
        return beehiveMapper.updateBeehive(beehive);
    }

    /**
     * 批量删除蜂箱管理
     * 
     * @param beehiveIds 需要删除的蜂箱管理主键
     * @return 结果
     */
    @Override
    public int deleteBeehiveByBeehiveIds(Long[] beehiveIds)
    {
        return beehiveMapper.deleteBeehiveByBeehiveIds(beehiveIds);
    }

    /**
     * 删除蜂箱管理信息
     * 
     * @param beehiveId 蜂箱管理主键
     * @return 结果
     */
    @Override
    public int deleteBeehiveByBeehiveId(Long beehiveId)
    {
        return beehiveMapper.deleteBeehiveByBeehiveId(beehiveId);
    }
}
