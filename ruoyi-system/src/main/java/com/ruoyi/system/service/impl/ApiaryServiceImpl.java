package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ApiaryMapper;
import com.ruoyi.system.domain.Apiary;
import com.ruoyi.system.service.IApiaryService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-04-12
 */
@Service
public class ApiaryServiceImpl implements IApiaryService 
{
    @Autowired
    private ApiaryMapper apiaryMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param apiaryId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Apiary selectApiaryByApiaryId(Long apiaryId)
    {
        return apiaryMapper.selectApiaryByApiaryId(apiaryId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param apiary 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Apiary> selectApiaryList(Apiary apiary)
    {
        return apiaryMapper.selectApiaryList(apiary);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param apiary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertApiary(Apiary apiary)
    {
        return apiaryMapper.insertApiary(apiary);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param apiary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateApiary(Apiary apiary)
    {
        return apiaryMapper.updateApiary(apiary);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param apiaryIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteApiaryByApiaryIds(Long[] apiaryIds)
    {
        return apiaryMapper.deleteApiaryByApiaryIds(apiaryIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param apiaryId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteApiaryByApiaryId(Long apiaryId)
    {
        return apiaryMapper.deleteApiaryByApiaryId(apiaryId);
    }
}
