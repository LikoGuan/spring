package com.liko.spring;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * Created by likoguan on 19/03/18.
 */
public class PeopleBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return People.class;
    }


    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String name = element.getAttribute("name");
        String age = element.getAttribute("age");
        String id = element.getAttribute("id");

        if (!StringUtils.isEmpty(name)){
            builder.addPropertyValue("name",name);
        }

        if (!StringUtils.isEmpty(age)){
            builder.addPropertyValue("age",age);
        }

        if (!StringUtils.isEmpty(id)){
            builder.addPropertyValue("id",id);
        }

    }
}
