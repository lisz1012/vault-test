package com.example.vaulttest.controller;

import com.example.vaulttest.config.AppConfig;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.core.VaultKeyValueOperations;
import org.springframework.vault.core.VaultKeyValueOperationsSupport;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class VaultController implements InitializingBean {
    @Autowired
    private AppConfig appConfig;

    private String password;

    @Override
    public void afterPropertiesSet() throws Exception {
        final VaultToken login = this.appConfig.clientAuthentication().login();
        final VaultTemplate vaultTemplate = new VaultTemplate(this.appConfig.vaultEndpoint(),
                new TokenAuthentication(login.getToken()));
        final VaultKeyValueOperations operations = vaultTemplate.opsForKeyValue("database",
                VaultKeyValueOperationsSupport.KeyValueBackend.versioned());
        final Map<String, Object> data = operations.get("postgres/vault-test").getData();
        password = (String) data.get("password");
        System.out.println("PASSWORD: " + password);
    }

    @GetMapping("/password")
    public String getPassword() {
        System.out.println(password);
        return password;
    }
}
