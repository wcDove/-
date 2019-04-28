package menber.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.icloudit.common.api.ShopResult;
import menber.entity.User;

@RequestMapping("/member")
public interface IUserservice {
	
	@PostMapping("regist")
public ShopResult regist(@RequestBody User user);
	
}
