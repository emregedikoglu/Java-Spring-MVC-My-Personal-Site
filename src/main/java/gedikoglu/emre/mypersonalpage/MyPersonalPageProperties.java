package gedikoglu.emre.mypersonalpage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="mypersonalpage")
public class MyPersonalPageProperties {
private boolean displayMyPersonalPage = false;
	
	public boolean isDisplayMyPersonalPage() {
		return displayMyPersonalPage;
	}
	
	public void setDisplayMyPersonalPage(boolean displayMyPersonalPage) {
		this.displayMyPersonalPage = displayMyPersonalPage;
	}
}
