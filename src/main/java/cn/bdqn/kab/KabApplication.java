package cn.bdqn.kab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class KabApplication {

    public static void main(String[] args) {
        SpringApplication.run(KabApplication.class, args);
    }

}
