package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.beekeeper;

/**
 * 蜂农信息Service接口
 * 
 * @author ruoyi
 * @date 2026-04-12
 */
public interface IbeekeeperService 
{
    /**
     * 查询蜂农信息
     * 
     * @param userId 蜂农信息主键
     * @return 蜂农信息
     */
    public beekeeper selectbeekeeperByUserId(Long userId);

    /**
     * 查询蜂农信息列表
     * 
     * @param beekeeper 蜂农信息
     * @return 蜂农信息集合
     */
    public List<beekeeper> selectbeekeeperList(beekeeper beekeeper);

    /**
     * 新增蜂农信息
     * 
     * @param beekeeper 蜂农信息
     * @return 结果
     */
    public int insertbeekeeper(beekeeper beekeeper);

    /**
     * 修改蜂农信息
     * 
     * @param beekeeper 蜂农信息
     * @return 结果
     */
    public int updatebeekeeper(beekeeper beekeeper);

    /**
     * 批量删除蜂农信息
     * 
     * @param userIds 需要删除的蜂农信息主键集合
     * @return 结果
     */
    public int deletebeekeeperByUserIds(Long[] userIds);

    /**
     * 删除蜂农信息信息
     * 
     * @param userId 蜂农信息主键
     * @return 结果
     */
    public int deletebeekeeperByUserId(Long userId);
}
