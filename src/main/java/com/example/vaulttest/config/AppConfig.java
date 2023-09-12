package com.example.vaulttest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.vault.authentication.AppRoleAuthentication;
import org.springframework.vault.authentication.AppRoleAuthenticationOptions;
import org.springframework.vault.authentication.ClientAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.config.AbstractVaultConfiguration;
import org.springframework.vault.support.VaultToken;

@Configuration
@ConfigurationProperties(prefix = "vault.appconfig")
public class AppConfig extends AbstractVaultConfiguration {
    private String token;
    public String getToken() {
        return this.token;
    }
    public void setToken(final String token) {
        this.token = token;
    }
    @Override
    public ClientAuthentication clientAuthentication() {
        System.out.println(token);
        final VaultToken initialToken = VaultToken.of(token);
        final AppRoleAuthenticationOptions options = AppRoleAuthenticationOptions
                .builder()
                .appRole("vault-test")
                .roleId(AppRoleAuthenticationOptions.RoleId.pull(initialToken))
                .secretId(AppRoleAuthenticationOptions.SecretId.pull(initialToken))
                .build();
        return new AppRoleAuthentication(options, this.restOperations());
    }
    @Override
    public VaultEndpoint vaultEndpoint() {
        final VaultEndpoint vaultEndpoint = VaultEndpoint.create("192.168.1.41", 8200);
        vaultEndpoint.setScheme("http");
        return vaultEndpoint;
    }
}