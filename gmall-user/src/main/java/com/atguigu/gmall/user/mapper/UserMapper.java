package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author: KSJ
 * @Date: Creat in 2:13 2020/2/26
 */

public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
