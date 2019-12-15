package com.bis.actuatorservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AdminClientApplication.class)
public class AdminClientApplicationTest {

  //  @Test
  //  public void contextLoads() {
  //  }

    @Test
    public void main() {
        AdminClientApplication.main(new String[] {});
    }

}
