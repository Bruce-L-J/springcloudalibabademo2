package cn.yiliedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain8001
{
    public static void main( String[] args )
    {
        SpringApplication.run(OrderNacosMain8001.class, args);

    }
}
