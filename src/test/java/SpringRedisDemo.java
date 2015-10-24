import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("classpath:applicationContext.xml")  
public class SpringRedisDemo {
	@Autowired  
    RedisTemplate jedisTemplate;  
  
    @Test  
     public void putAndGet(){  
    	jedisTemplate.opsForValue().set("aa2", "arg1"); 
        Object name =  jedisTemplate.opsForValue().get("aa2");
        System.out.println(name);  
    }  
    
    
}
