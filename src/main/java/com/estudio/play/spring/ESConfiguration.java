package com.estudio.play.spring;

import org.springframework.context.annotation.Import;

/**
 * @author jyang
 * @created 3/21/16
 */
@Import({WebAppConfiguration.class, AutoScanConfiguration.class})
public class ESConfiguration {
}
