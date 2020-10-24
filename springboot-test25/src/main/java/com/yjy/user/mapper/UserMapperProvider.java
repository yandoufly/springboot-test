package com.yjy.user.mapper;

import org.springframework.util.StringUtils;

import com.yjy.user.entity.User;

public class UserMapperProvider {

	public String findByUser(User user) {
		String sql = "select * from tb_user t";
		
		StringBuilder sb = new StringBuilder("");
		// username 模糊查询
		if (!StringUtils.isEmpty(user.getUsername())) {
			sb.append(" and t.username like CONCAT('%',#{username},'%')");
		}
		
		// age 大于
		if (user.getAge() != null) {
			sb.append(" and t.age >= #{age}");
		}
		
		// 存在一条订单记录
//		sb.append(" and exists (select 1 from tb_order a where a.user_id = t.id)");
		
		return (sb.length() > 0) ? (sql + " where 1 = 1" + sb.toString()) : sql;
	}
}