package com.shecannotsee;

import com.shecannotsee.entity.Printf;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试单元
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EssaysApplicationTest
{
    @Autowired
    Printf printf;

    @Test
    public void contextLoads(){
        System.out.println(printf);
    }
}
