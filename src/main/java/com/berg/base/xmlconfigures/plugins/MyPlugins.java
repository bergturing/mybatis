package com.berg.base.xmlconfigures.plugins;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;

import java.util.Properties;

/**
 * 自定义mybatis插件
 */

public class MyPlugins implements Interceptor{

    @Override
    public Object intercept(Invocation invocation) throws Throwable {


        return null;
    }

    @Override
    public Object plugin(Object o) {

        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
