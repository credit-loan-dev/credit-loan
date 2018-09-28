package com.sixliu.apigateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.cloud.gateway.filter.factory.PrefixPathGatewayFilterFactory;

/**
 * @author:MG01867
 * @date:2018/9/25
 * @email:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class PreGatewayFilterFactory extends AbstractGatewayFilterFactory<PrefixPathGatewayFilterFactory.Config> {

    @Override
    public GatewayFilter apply(PrefixPathGatewayFilterFactory.Config config) {
        return null;
    }
}
