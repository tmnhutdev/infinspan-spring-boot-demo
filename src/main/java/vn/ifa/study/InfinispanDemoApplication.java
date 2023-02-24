package vn.ifa.study;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@SpringBootApplication(scanBasePackages = "vn.ifa.study")
public class InfinispanDemoApplication {

	public static void main(String[] args) {
	    String nodeId = System.getProperty("NODE_ID");
	    if(!StringUtils.hasLength(nodeId)) {
	        try {
                nodeId = InetAddress.getLocalHost().getHostName();
            }
            catch (UnknownHostException e) {
                e.printStackTrace();
            }
	    }
	    System.setProperty("NODE_ID", nodeId);
		SpringApplication.run(InfinispanDemoApplication.class, args);
	}

}
