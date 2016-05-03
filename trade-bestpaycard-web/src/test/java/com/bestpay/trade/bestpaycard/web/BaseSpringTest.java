package com.bestpay.trade.bestpaycard.web;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * <ul>
 * <li>测试父类</li>
 * <li>User: wen Date: 2014-10-09 Time: 5:26 PM</li>
 * </ul>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/application-context.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public abstract class BaseSpringTest extends TestCase {

}
