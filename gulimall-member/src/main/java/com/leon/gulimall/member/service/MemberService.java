package com.leon.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leon.common.utils.PageUtils;
import com.leon.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author leon
 * @email 1334575226@qq.com
 * @date 2022-12-08 02:49:36
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

