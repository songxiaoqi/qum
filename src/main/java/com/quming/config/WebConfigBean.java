package com.quming.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.annotation.PostConstruct;

@Configuration
public class WebConfigBean {

    @Autowired
    private RequestMappingHandlerAdapter requestMappingHandlerAdapter;

    @PostConstruct
    public void initEditableValidation(){
        ConfigurableWebBindingInitializer webBindingInitializer = (ConfigurableWebBindingInitializer) requestMappingHandlerAdapter.getWebBindingInitializer();
        if(webBindingInitializer.getConversionService()!=null){
            GenericConversionService conversionService = (GenericConversionService) webBindingInitializer.getConversionService();
            conversionService.addConverter(new DateFormartConverter());
        }
    }

}
