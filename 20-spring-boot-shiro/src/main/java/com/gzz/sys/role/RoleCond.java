package com.gzz.sys.role;

import com.gzz.base.BaseCondition;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @类说明 [角色]查询条件实体
 * @author: 高振中
 * @date : 2018-12-24 21:36:34
 **/
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleCond extends BaseCondition {

	/**
	 * @方法说明: 拼加自定义条件
	 **/
	@Override
	public void addCondition() {
		add(id, "AND t.id = ?");
		add(role, "AND t.role LIKE ?", 3);
		add(name, "AND t.name LIKE ?", 3);
		add(available, "AND t.available = ?");
	}

	private Long id; // 主键
	private String role; // 角色
	private String name; // 名称
	private Byte available; // 是否可用
}