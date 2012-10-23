package com.kjlink.quartz.manager;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kjlink.quartz.manager.config.AppConfig;
import com.kjlink.quartz.manager.config.AppConfigQuartz;

@RunWith(SpringJUnit4ClassRunner.class)
@ ContextConfiguration(classes = {AppConfig.class,  AppConfigQuartz.class})
public class MainTest {
	
	/**
	 * <p>为测试准备材料</p>
	 * <p>目前可作本测试用例的为入口方法，当启动测试用例时，spring application context 会被启动，
	 * 然后quartz jobs也随即被启动。</p>
	 * 
	 * @author dearshor
	 * @since 1.0
	 */
	public @BeforeClass void setup() {}
	
	public @Test void testQuery() {
		
	}

}
