package com.totoro.tororodemo.design_pattern;

import com.totoro.tororodemo.design_pattern.chain_of_responsibility.service.HeavyTeamCheckService;
import com.totoro.tororodemo.design_pattern.chain_of_responsibility.vo.HeavyTeamVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/4/13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ChainOfResponsibilityTest {

    @Autowired
    private HeavyTeamCheckService heavyTeamCheckService;

    @Test
    public void testDesin() {
        HeavyTeamVO heavyTeamVO = new HeavyTeamVO(null, "", "", 0);
        System.out.println(heavyTeamCheckService.createHT(heavyTeamVO));

    }
}
