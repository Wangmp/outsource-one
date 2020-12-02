package com.wmp.cn;

import cn.hutool.core.date.DateUtil;
import com.wmp.cn.utils.DateUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.logging.SimpleFormatter;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OutsourceOneApplication.class)
class OutsourceOneApplicationTests {

    @Test
    void test() {
        SimpleFormatter sdf = new SimpleFormatter();
        String a = "2020-11-25 22:22:22";
        Date ab= DateUtil.parse(a);

        boolean tf = DateUtils.isTheSameDay(ab,new Date());
        System.out.println(tf);
    }

}
