package com.example.vaulttest.test;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Proxy;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringProcessorTest {
    @Test
    public void test() {
        String s = "/Users/shuzheng/Library/Java/JavaVirtualMachines/corretto-17.0.4/Contents/Home/bin/java -XX:TieredStopAtLevel=1 -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=57743:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/shuzheng/IdeaProjects/vault-test/target/classes:/Users/shuzheng/.m2/repository/org/springframework/boot/spring-boot-starter-web/3.1.3/spring-boot-starter-web-3.1.3.jar:/Users/shuzheng/.m2/repository/org/springframework/boot/spring-boot-starter/3.1.3/spring-boot-starter-3.1.3.jar:/Users/shuzheng/.m2/repository/org/springframework/boot/spring-boot/3.1.3/spring-boot-3.1.3.jar:/Users/shuzheng/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/3.1.3/spring-boot-autoconfigure-3.1.3.jar:/Users/shuzheng/.m2/repository/org/springframework/boot/spring-boot-starter-logging/3.1.3/spring-boot-starter-logging-3.1.3.jar:/Users/shuzheng/.m2/repository/ch/qos/logback/logback-classic/1.4.11/logback-classic-1.4.11.jar:/Users/shuzheng/.m2/repository/ch/qos/logback/logback-core/1.4.11/logback-core-1.4.11.jar:/Users/shuzheng/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.20.0/log4j-to-slf4j-2.20.0.jar:/Users/shuzheng/.m2/repository/org/apache/logging/log4j/log4j-api/2.20.0/log4j-api-2.20.0.jar:/Users/shuzheng/.m2/repository/org/slf4j/jul-to-slf4j/2.0.7/jul-to-slf4j-2.0.7.jar:/Users/shuzheng/.m2/repository/jakarta/annotation/jakarta.annotation-api/2.1.1/jakarta.annotation-api-2.1.1.jar:/Users/shuzheng/.m2/repository/org/yaml/snakeyaml/1.33/snakeyaml-1.33.jar:/Users/shuzheng/.m2/repository/org/springframework/boot/spring-boot-starter-json/3.1.3/spring-boot-starter-json-3.1.3.jar:/Users/shuzheng/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.15.2/jackson-datatype-jdk8-2.15.2.jar:/Users/shuzheng/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.15.2/jackson-datatype-jsr310-2.15.2.jar:/Users/shuzheng/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.15.2/jackson-module-parameter-names-2.15.2.jar:/Users/shuzheng/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/3.1.3/spring-boot-starter-tomcat-3.1.3.jar:/Users/shuzheng/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/10.1.12/tomcat-embed-core-10.1.12.jar:/Users/shuzheng/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/10.1.12/tomcat-embed-el-10.1.12.jar:/Users/shuzheng/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/10.1.12/tomcat-embed-websocket-10.1.12.jar:/Users/shuzheng/.m2/repository/org/springframework/spring-web/6.0.11/spring-web-6.0.11.jar:/Users/shuzheng/.m2/repository/io/micrometer/micrometer-observation/1.11.3/micrometer-observation-1.11.3.jar:/Users/shuzheng/.m2/repository/io/micrometer/micrometer-commons/1.11.3/micrometer-commons-1.11.3.jar:/Users/shuzheng/.m2/repository/org/springframework/spring-webmvc/6.0.11/spring-webmvc-6.0.11.jar:/Users/shuzheng/.m2/repository/org/springframework/spring-aop/6.0.11/spring-aop-6.0.11.jar:/Users/shuzheng/.m2/repository/org/springframework/spring-expression/6.0.11/spring-expression-6.0.11.jar:/Users/shuzheng/.m2/repository/org/springframework/vault/spring-vault-core/3.0.4/spring-vault-core-3.0.4.jar:/Users/shuzheng/.m2/repository/org/springframework/spring-core/6.0.11/spring-core-6.0.11.jar:/Users/shuzheng/.m2/repository/org/springframework/spring-jcl/6.0.11/spring-jcl-6.0.11.jar:/Users/shuzheng/.m2/repository/org/springframework/spring-context/6.0.11/spring-context-6.0.11.jar:/Users/shuzheng/.m2/repository/org/springframework/spring-beans/6.0.11/spring-beans-6.0.11.jar:/Users/shuzheng/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.15.2/jackson-databind-2.15.2.jar:/Users/shuzheng/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.15.2/jackson-annotations-2.15.2.jar:/Users/shuzheng/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.15.2/jackson-core-2.15.2.jar:/Users/shuzheng/.m2/repository/org/springframework/boot/spring-boot-configuration-processor/3.1.3/spring-boot-configuration-processor-3.1.3.jar:/Users/shuzheng/.m2/repository/org/slf4j/slf4j-api/2.0.7/slf4j-api-2.0.7.jar com.example.vaulttest.VaultTestApplication\n" +
                "\n" +
                "  .   ____          _            __ _ _\n" +
                " /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\\n" +
                "( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\\n" +
                " \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )\n" +
                "  '  |____| .__|_| |_|_| |_\\__, | / / / /\n" +
                " =========|_|==============|___/=/_/_/_/\n" +
                " :: Spring Boot ::                (v3.1.3)\n" +
                "\n" +
                "2023-09-12T00:55:07.714-07:00  INFO 24137 --- [           main] c.e.vaulttest.VaultTestApplication       : Starting VaultTestApplication using Java 17.0.4 with PID 24137 (/Users/shuzheng/IdeaProjects/vault-test/target/classes started by shuzheng in /Users/shuzheng/IdeaProjects/vault-test)\n" +
                "2023-09-12T00:55:07.716-07:00  INFO 24137 --- [           main] c.e.vaulttest.VaultTestApplication       : No active profile set, falling back to 1 default profile: \"default\"\n" +
                "2023-09-12T00:55:08.040-07:00  INFO 24137 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)\n" +
                "2023-09-12T00:55:08.043-07:00  INFO 24137 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]\n" +
                "2023-09-12T00:55:08.043-07:00  INFO 24137 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.12]\n" +
                "2023-09-12T00:55:08.077-07:00  INFO 24137 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext\n" +
                "2023-09-12T00:55:08.077-07:00  INFO 24137 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 340 ms\n" +
                "hvs.CAESID6A5sB5tqIUWpz93K-nsAXxoT_Q2-ePM75vJWkxRUuJGh4KHGh2cy5lODUybXp3akNZTTRzZ2dlSUdMZnFudVE\n" +
                "PASSWORD: password\n" +
                "hvs.CAESID6A5sB5tqIUWpz93K-nsAXxoT_Q2-ePM75vJWkxRUuJGh4KHGh2cy5lODUybXp3akNZTTRzZ2dlSUdMZnFudVE\n" +
                "2023-09-12T00:55:08.337-07:00  INFO 24137 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''\n" +
                "2023-09-12T00:55:08.341-07:00  INFO 24137 --- [           main] c.e.vaulttest.VaultTestApplication       : Started VaultTestApplication in 0.773 seconds (process running for 1.119)\n" +
                "\n" +
                "Process finished with exit code 130 (interrupted by signal 2: SIGINT)";
        for (int i = 0; i < 7; i++) {
            s += " " + s;
        }
        int win1 = 0;
        int win2 = 0;
        int draw = 0;
        for (int t = 0; t < 20; t++) {
            String[] words = s.split("\\s+");
            StringProcessor sp = new StringProcessor();
            long start = System.currentTimeMillis();
            sp.process(words);
            long time1 = System.currentTimeMillis() - start;

            OptimizedStringProcessor osp = new OptimizedStringProcessor();
            start = System.currentTimeMillis();
            osp.process(words);
            long time2 = System.currentTimeMillis() - start;

            if (time1 < time2) {
                win1++;
            } else if (time1 > time2) {
                win2++;
            } else {
                draw++;
            }
        }
        System.out.println("StringProcessor won: " + win1);
        System.out.println("OptimizedStringProcessor won: " + win2);
        System.out.println("Draw: " + draw);
        System.out.println("String length: " + s.length());
    }

    class StringProcessor {
        public void process(String[] words) {
//            String[] words = {"big str", "big str "}; //大字符串数组
            for (String word : words) {
                if (word != null && !word.isEmpty()) {
                    System.out.println(word.toUpperCase());
                }
            }
        }
    }

    class OptimizedStringProcessor {
        public void process(String[] strs) {
            List<String> words = Stream.of(strs).collect(Collectors.toList());
            List<String> filteredWords = (List) Proxy.newProxyInstance(words.getClass().getClassLoader(), new Class[]{List.class}, (proxy, method, methodArgs) -> {
                if (method.getName().equals("get")) {
                    String word = (String) method.invoke(words, methodArgs);
                    if (word == null || word.isEmpty()) {
                        return null;
                    } else {
                        return word.toUpperCase();
                    }
                } else {
                    return method.invoke(words, methodArgs);
                }
            });
            for (String word : filteredWords) {
                if (word != null) {
                    System.out.println(word);
                }
            }
        }
    }
}
