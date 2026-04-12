package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Apiary;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2026-04-12
 */
public interface IApiaryService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param apiaryId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Apiary selectApiaryByApiaryId(Long apiaryId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param apiary 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Apiary> selectApiaryList(Apiary apiary);

    /**
     * 新增【请填写功能名称】
     * 
     * @param apiary 【请填写功能名称】
     * @return 结果
     */
    public int insertApiary(Apiary apiary);

    /**
     * 修改【请填写功能名称】
     * 
     * @param apiary 【请填写功能名称】
     * @return 结果
     */
    public int updateApiary(Apiary apiary);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param apiaryIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteApiaryByApiaryIds(Long[] apiaryIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param apiaryId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteApiaryByApiaryId(Long apiaryId);
}
