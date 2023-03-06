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
public class PaymentNocasMain9002
{
    public static void main( String[] args )
    {
        SpringApplication.run(PaymentNocasMain9002.class, args);

    }
}
