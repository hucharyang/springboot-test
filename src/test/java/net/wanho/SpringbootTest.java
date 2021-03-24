package net.wanho;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import redis.clients.jedis.Jedis;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
@ActiveProfiles("test")
public class SpringbootTest {
    @Autowired
    RedisTemplate redisTemplate;
    @Before
    public void init() {
        log.info("开始测试-----------------");
    }

    @After
    public void after() {
        log.info("测试结束-----------------");
    }


    @Test
    public  void jedisTest() {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("192.168.0.4");
        // 如果 Redis 服务设置来密码，需要下面这行，没有就不需要

        jedis.auth("123456");
        System.out.println("连接成功");
        //查看服务是否运行

        jedis.del("123");
        System.out.println("服务正在运行: "+jedis.ping());
    }

    @Test
    public void red() {


        redisTemplate.delete("123");

    }

}
