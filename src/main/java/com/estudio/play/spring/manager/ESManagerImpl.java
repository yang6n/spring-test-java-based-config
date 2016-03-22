package com.estudio.play.spring.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;
import sun.text.normalizer.VersionInfo;

import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import java.io.IOException;

/**
 * @author jyang
 * @created 3/21/16
 */
@Component
public class ESManagerImpl implements IESManager {

    @Autowired
    private IESHrManager hrManager;

    public VersionInfo getVersionInfo() {
        Source source = new DOMSource();
        try {
            hrManager.getValidator().validate(source);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return VersionInfo.getInstance(2, 3, 4, 10);
    }
}
