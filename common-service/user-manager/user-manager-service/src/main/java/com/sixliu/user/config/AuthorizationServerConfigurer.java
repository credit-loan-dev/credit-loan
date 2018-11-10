package com.sixliu.user.config;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.builders.InMemoryClientDetailsServiceBuilder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
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
public class AuthorizationServerConfigurer extends AuthorizationServerConfigurerAdapter {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private RedisConnectionFactory connectionFactory;

	@Autowired
	private AppDao appDao;

	@Bean
	public RedisTokenStore tokenStore() {
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
	}
	
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.authenticationManager(authenticationManager).tokenStore(tokenStore());
	}

	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
		security.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()");
	}
}
