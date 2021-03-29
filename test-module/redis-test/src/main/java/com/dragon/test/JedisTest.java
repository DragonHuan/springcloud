package com.dragon.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Created by Dragon
 */
public class JedisTest {

    @Test
    public void test(){
      Jedis jedis = new Jedis("localhost",6379);
    }

}
