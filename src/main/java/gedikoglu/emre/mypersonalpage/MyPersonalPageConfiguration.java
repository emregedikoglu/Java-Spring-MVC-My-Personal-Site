package gedikoglu.emre.mypersonalpage;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyPersonalPageConfiguration {
	@Autowired
	private MyPersonalPageProperties myPersonalPageProperties;
	
	@PostConstruct
	public void init() {
		System.out.println("Display my personal page: " + myPersonalPageProperties.isDisplayMyPersonalPage());
	}
}
