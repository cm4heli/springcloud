package cm;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

	public String sayHiFromClientOne(String name) {
		return "出错了";
	}

}
