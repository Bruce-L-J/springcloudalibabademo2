package cn.yiliedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentNocasMain9001
{
    public static void main( String[] args )
    {
        SpringApplication.run(PaymentNocasMain9001.class, args);

    }
}
