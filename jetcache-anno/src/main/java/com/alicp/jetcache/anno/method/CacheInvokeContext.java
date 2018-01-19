/**
 * Created on  13-10-02 16:10
 */
package com.alicp.jetcache.anno.method;

import com.alicp.jetcache.Cache;

import java.lang.reflect.Method;
import java.util.function.Function;

/**
 * @author <a href="mailto:areyouok@gmail.com">huangli</a>
 */
public class CacheInvokeContext {
    private Invoker invoker;
    private Method method;
    private Object[] args;
    private CacheInvokeConfig cacheInvokeConfig;

    private Function<CacheInvokeContext, Cache> cacheFunction;
    private String[] hiddenPackages;

    private Object result = null;

    public CacheInvokeContext(){
    }


    public void setInvoker(Invoker invoker) {
        this.invoker = invoker;
    }

    public Invoker getInvoker() {
        return invoker;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public void setCacheInvokeConfig(CacheInvokeConfig cacheInvokeConfig) {
        this.cacheInvokeConfig = cacheInvokeConfig;
    }

    public CacheInvokeConfig getCacheInvokeConfig() {
        return cacheInvokeConfig;
    }

    public void setHiddenPackages(String[] hiddenPackages) {
        this.hiddenPackages = hiddenPackages;
    }

    public String[] getHiddenPackages() {
        return hiddenPackages;
    }

    public void setCacheFunction(Function<CacheInvokeContext, Cache> cacheFunction) {
        this.cacheFunction = cacheFunction;
    }

    public Function<CacheInvokeContext, Cache> getCacheFunction() {
        return cacheFunction;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Object getResult() {
        return result;
    }
}
