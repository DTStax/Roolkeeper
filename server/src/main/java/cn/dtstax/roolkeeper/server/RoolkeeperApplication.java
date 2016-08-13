package cn.dtstax.roolkeeper.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Description for Class RoolkeeperApplication
 *
 * @author Lynch Lee<Lynch.lee9527@gmail.com>
 * @version 16/8/13.
 */
@ComponentScan("cn.dtstax.roolkeeper")
@SpringBootApplication
public class RoolkeeperApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoolkeeperApplication.class, args);
    }


}
