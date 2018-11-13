package com.sixliu.user.authority;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Component;

import com.sixliu.user.dto.AppDTO;
import com.sixliu.user.dto.ResourceDTO;
import com.sixliu.user.service.AppService;
import com.sixliu.user.service.ResourceService;

/**
 * @author:MG01867
 * @date:2018年11月13日
 * @email:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Component
public class ClientDetailsServiceImpl implements ClientDetailsService {

	@Autowired
	private AppService appService;

	@Autowired
	private ResourceService resourceService;

	private Map<String, ClientDetails> cache = new ConcurrentHashMap<>();

	@Override
	public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
		return cache.computeIfAbsent(clientId, newKek -> {
			AppDTO app = appService.getByCode(clientId);
			if (null == app) {
				throw new ClientRegistrationException(String.format("The app[%s] is illeagl", clientId));
			}
			List<ResourceDTO> resources = resourceService.listByAppId(app.getId());
			Set<String> resourceIds = null;
			if (null != resources) {
				resourceIds = new HashSet<>(resources.size());
				for (ResourceDTO resource : resources) {
					resourceIds.add(resource.getId());
				}
			}
			return new ClientDetailsImpl(app, resourceIds);
		});
	}

	public static class ClientDetailsImpl implements ClientDetails {

		/**
		 * 
		 */
		private static final long serialVersionUID = 5132305652639507445L;

		private AppDTO app;
		private Set<String> resourceIds;

		public ClientDetailsImpl(AppDTO app, Set<String> resourceIds) {
			this.app = app;
			this.resourceIds = resourceIds;
		}

		@Override
		public String getClientId() {
			return app.getCode();
		}

		@Override
		public Set<String> getResourceIds() {
			return resourceIds;
		}

		@Override
		public boolean isSecretRequired() {
			return true;
		}

		@Override
		public String getClientSecret() {
			return app.getSecret();
		}

		@Override
		public boolean isScoped() {
			return app.isScoped();
		}

		@Override
		public Set<String> getScope() {
			return app.getScopes();
		}

		@Override
		public Set<String> getAuthorizedGrantTypes() {
			return app.getAuthorizedGrantTypes();
		}

		@Override
		public Set<String> getRegisteredRedirectUri() {
			return null;
		}

		@Override
		public Collection<GrantedAuthority> getAuthorities() {
			return null;
		}

		@Override
		public Integer getAccessTokenValiditySeconds() {
			return app.getAccessTokenValiditySeconds();
		}

		@Override
		public Integer getRefreshTokenValiditySeconds() {
			return app.getRefreshTokenValiditySeconds();
		}

		@Override
		public boolean isAutoApprove(String scope) {
			return app.isAutoApprove();
		}

		@Override
		public Map<String, Object> getAdditionalInformation() {
			return null;
		}

	}

}
