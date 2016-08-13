package cn.dtstax.roolkeeper.server;

import cn.dtstax.roolkeeper.services.Example1;
import cn.dtstax.roolkeeper.services.Example2;
import cn.dtstax.roolkeeper.services.Example3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Description for Class TestRunner
 *
 * @author Lynch Lee<Lynch.lee9527@gmail.com>
 * @version 16/8/13.
 */
@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private Example1 example1;
    @Autowired
    private Example2 example2;
    @Autowired
    private Example3 example3;


    @Override
    public void run(String... strings) throws Exception {
        example1.run(strings);
        example2.run(strings);
        example3.run(strings);
    }

}
