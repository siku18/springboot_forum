/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import forum.service.LoggerServiceJpaImpl;
import forum.service.SecurityService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import forum.spring.SpringConfig;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author ETY
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class SpringTest {
    
    @PersistenceContext
    private EntityManager em;
    
    @Autowired
    private LoggerServiceJpaImpl logger1;
    @Autowired
    private LoggerServiceJpaImpl logger2;
    
    @Autowired
    @Qualifier("secu_a")
    private SecurityService s1;
    
    @Autowired
    @Qualifier("secu_b")
    private SecurityService s2;
    
    @Test
    public void tessdsk(){
        Assert.assertTrue(logger1==logger2);
    }
    
//    @Test
//    public void doNadaOK(){
//        s1.check();
//    }
    
//    @Test
//    public void doNadjhhaOK(){
//        
//    }
    
}
