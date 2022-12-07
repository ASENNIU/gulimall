package com.leon.gulimall.member.dao;

import com.leon.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author leon
 * @email 1334575226@qq.com
 * @date 2022-12-08 02:49:36
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
