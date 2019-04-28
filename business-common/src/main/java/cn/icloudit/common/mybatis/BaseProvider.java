
package cn.icloudit.common.mybatis;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import cn.icloudit.utils.ReflectionUtils;

public class BaseProvider {

	/**
	 * 
	 * @methodDesc: 功能描述:(自定义封装sql语句)
	 * @param: @return
	 */
	public String save(Map<String, Object> map) {
		// 实体类
		Object oj = map.get("oj");
		// 表名称
		String table = (String) map.get("table");
		// 生成添加的sql语句。 使用反射机制
		// 步驟：使用反射机制加载这个类所有属性
		// INSERT INTO `shop_user` (username,password,phone,email,created,updated)
		// VALUES ('tom', '123',
		// '110', 'abc@163.com', '2018-04-06 17:03:55', '2018-04-06 17:03:55');
		SQL sql = new SQL() {
			{
				INSERT_INTO(table);
				VALUES(ReflectionUtils.fatherAndSonField(oj), ReflectionUtils.fatherAndSonFieldValue(oj));

			}
		};
		return sql.toString();
	}
}
