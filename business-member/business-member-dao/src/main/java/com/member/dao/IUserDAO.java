package com.member.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;



import cn.icloudit.common.mybatis.IBaseDAO;
import feign.Param;
import menber.entity.User;

@Mapper
public interface IUserDAO  extends IBaseDAO {

	@Select("select ID,USERNAME,PASSWORD,phone,EMAIL, created,updated from shop_user  WHERE PHONE=#{phone} and password=#{password}")
	public User getUserPhoneAndPwd(@Param("phone") String userName, @Param("password") String password);

	@Select("select ID,USERNAME,PASSWORD,phone,EMAIL, created,updated from shop_user  WHERE id=#{id}")
	public User getUserInfo(@Param("id") Long id);
	
}
	

