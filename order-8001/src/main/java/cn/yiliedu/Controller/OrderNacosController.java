package cn.yiliedu.Controller;

import cn.yiliedu.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderNacosController
{
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    PaymentService paymentService;

    private String serverURL = "http://nacos-payment-provider";

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Integer id)
    {
        //return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
        return paymentService.getPayment(id);
    }



}
