package com.estudio.play.spring.manager;

import com.estudio.play.spring.AutoScanConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.text.normalizer.VersionInfo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * @author jyang
 * @created 3/21/16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutoScanConfiguration.class)
public class ESManagerImplTest {

    @Autowired
    private ESManagerImpl instance;

    @Before
    public void setup() {
//        instance = new ESManagerImpl();
    }

    @Test
    public void testESManagerImpl() {
        VersionInfo actual = instance.getVersionInfo();
        assertThat(actual, is(notNullValue()));
    }
}


@Configurable
@ComponentScan(basePackages = "com.estudio.play.spring.manager")
class BeanConfiguration {
//    @Bean
//    public ESManagerImpl ESManagerImpl() {
//        ESManagerImpl manager = new ESManagerImpl();
//        return manager;
//    }
//
//    @Bean
//    public ESHrManagerImpl IESHrManager() {
//        ESHrManagerImpl manager = new ESHrManagerImpl();
//        return manager;
//    }
}
