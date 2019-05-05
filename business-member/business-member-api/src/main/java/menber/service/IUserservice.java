package menber.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.common.ShopResult;

import menber.entity.User;

@RequestMapping("/member")
public interface IUserservice {
	
	@PostMapping("regist")
public ShopResult regist(@RequestBody User user);

	public ShopResult result(@RequestBody User User);
	
	@PostMapping("/login")
	public ShopResult login(@RequestBody User user);

	/**
	 * 
	 * @methodDesc: 功能描述:(使用token查找用户信息)
	 * @param: @param
	 *             token
	 * @param: @return
	 */
	@PostMapping("/getUser")
	public ShopResult getUser(@RequestParam("token") String token);
	
}
