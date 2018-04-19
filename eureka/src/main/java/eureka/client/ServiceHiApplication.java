package eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RestController
@FeignClient(value = "service-hi2")
public class ServiceHiApplication {
	 @Autowired
	    private RestTemplate restTemplate;

	    @Bean
	    public RestTemplate getRestTemplate(){
	        return new RestTemplate();
	    }
    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home() {
    	return restTemplate.getForObject("http://localhost:8086/hi", String.class);
    }
    
    
    @RequestMapping("/info")
    public String call() {
        return "call hi2 ,i am from port:" +port;
    }

}
