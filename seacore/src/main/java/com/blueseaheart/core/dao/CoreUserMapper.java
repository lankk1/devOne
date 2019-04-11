package com.blueseaheart.core.dao;

import com.blueseaheart.core.domain.CoreUser;
import com.blueseaheart.core.domain.CoreUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoreUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_user
     *
     * @mbggenerated
     */
    int countByExample(CoreUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_user
     *
     * @mbggenerated
     */
    int insert(CoreUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_user
     *
     * @mbggenerated
     */
    int insertSelective(CoreUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_user
     *
     * @mbggenerated
     */
    List<CoreUser> selectByExample(CoreUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_user
     *
     * @mbggenerated
     */
    CoreUser selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_user
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CoreUser record, @Param("example") CoreUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_user
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CoreUser record, @Param("example") CoreUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CoreUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CoreUser record);
}