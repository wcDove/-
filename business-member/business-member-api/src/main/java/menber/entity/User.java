package menber.entity;


import cn.icloudit.common.api.enity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends BaseEntity{
	
	private String userName;
	private String password;
	private String phone;
	private String email;
	

}
