package com.estudio.play.spring.manager;

import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.validation.Validator;
import java.io.IOException;

/**
 * @author jyang
 * @created 3/21/16
 */
@Component
public class ESHrManagerImpl implements IESHrManager {

    public Validator getValidator() {
        return new Validator() {
            @Override
            public void reset() {

            }

            @Override
            public void validate(Source source, Result result) throws SAXException, IOException {

            }

            @Override
            public ErrorHandler getErrorHandler() {
                return null;
            }

            @Override
            public void setErrorHandler(ErrorHandler errorHandler) {

            }

            @Override
            public LSResourceResolver getResourceResolver() {
                return null;
            }

            @Override
            public void setResourceResolver(LSResourceResolver lsResourceResolver) {

            }
        };
    }
}
