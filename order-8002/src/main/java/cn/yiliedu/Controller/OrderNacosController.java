package cn.yiliedu.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@RestController
@Slf4j
public class OrderNacosController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    DiscoveryClient discoveryClient;
    private String serverURL = "http://nacos-payment-provider";

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id) {

        List<ServiceInstance> instances = discoveryClient.getInstances("nacos-payment-provider");

        int index = new Random().nextInt(instances.size());

        ServiceInstance serviceInstance = instances.get(index);

        String url = serviceInstance.getHost() + ":" +

                serviceInstance.getPort();

        log.info(">>从nacos中获取到的微服务地址为:" + url);

        return restTemplate.getForObject("http://"+url+"/payment/nacos/" + id, String.class);
    }

}
