package com.group.special_work_exam.utils;

import com.group.special_work_exam.uservip.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RedisUtils {

    @Autowired
     private RedisTemplate<String,Object> redisTemplate;

    public void setValue(String key,Object value){
        //存储redis对象
        ValueOperations<String , Object> valueOperations= redisTemplate.opsForValue();

        valueOperations.set(key,value);

    }
    public Object getValue(String key){
        //存储redis对象
        ValueOperations<String , Object> valueOperations= redisTemplate.opsForValue();
        Object o = valueOperations.get(key);
        return o;


    }
    public void setUsers(List<User> users) {
        //存储redis对象
        ValueOperations<String , Object> valueOperations= redisTemplate.opsForValue();

        //开启通道存储
        redisTemplate.executePipelined(new RedisCallback<Object>() {
            @Override

            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer keySerializer =redisTemplate.getKeySerializer();
                RedisSerializer valueSerializer = redisTemplate.getValueSerializer();
                for (User u:users){
                    redisConnection.set(keySerializer.serialize(u.getPhone()),valueSerializer.serialize(u));
                }
                return null;
            }
        });
//        valueOperations.set(key,value);

    }

}
