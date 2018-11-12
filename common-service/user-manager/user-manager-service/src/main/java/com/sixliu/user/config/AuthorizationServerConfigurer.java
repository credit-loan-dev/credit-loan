package com.sixliu.user.config;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.builders.InMemoryClientDetailsServiceBuilder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import com.sixliu.user.repository.dao.AppDao;
import com.sixliu.user.repository.entity.AppEntity;

/**
 * @author:MG01867
 * @date:2018年11月10日
 * @email:359852326@qq.com
 * @version:
 * @describe
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfigurer extends AuthorizationServerConfigurerAdapter {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private RedisConnectionFactory connectionFactory;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private ClientDetailsService clientDetailsService;

	@Autowired
	private AppDao appDao;

	@Bean
	public RedisTokenStore redisTokenStore() {
		return new RedisTokenStore(connectionFactory);
	}

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		List<AppEntity> apps = appDao.listAll();
		InMemoryClientDetailsServiceBuilder builder = clients.inMemory();
		for (AppEntity app : apps) {
			String[] authorizedGrantTypes=StringUtils.split(app.getAuthorizedGrantTypes(),";");
			String[] scopes=StringUtils.split(app.getScopes(),";");
			builder.withClient(app.getCode()).secret(app.getSecret()).redirectUris(app.getRedirectUrl())
					.authorizedGrantTypes(authorizedGrantTypes).scopes(scopes).autoApprove(true)
					.accessTokenValiditySeconds(app.getAccessTokenValiditySeconds())
					.refreshTokenValiditySeconds(app.getRefreshTokenValiditySeconds());
		}
		//clients.withClientDetails(clientDetailsService);
	}
	
    @Primary
    @Bean
    public DefaultTokenServices defaultTokenServices(){
        DefaultTokenServices tokenServices = new DefaultTokenServices();
        tokenServices.setTokenStore(redisTokenStore());
        tokenServices.setSupportRefreshToken(true);
        tokenServices.setClientDetailsService(clientDetailsService);
        tokenServices.setAccessTokenValiditySeconds(60*60*12); // token有效期自定义设置，默认12小时
        tokenServices.setRefreshTokenValiditySeconds(60 * 60 * 24 * 7);//默认30天，这里修改
        return tokenServices;
    }
    
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.authenticationManager(authenticationManager);
		endpoints.tokenStore(redisTokenStore());
		endpoints.tokenServices(defaultTokenServices());
		endpoints.userDetailsService(userDetailsService);
	}

	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
		security.tokenKeyAccess("permitAll()");
        security .checkTokenAccess("isAuthenticated()");
        security.allowFormAuthenticationForClients();
	}
}
