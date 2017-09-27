package net.safedata.maven.intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.SimpleCommandLinePropertySource;

@SpringBootApplication
public class MavenIntroApplication {

	private static final String SPRING_PROFILES_ACTIVE_PROPERTY = "spring.profiles.active";

	public static void main(String[] args) {
		final SpringApplication app = new SpringApplication(MavenIntroApplication.class);

		setDefaultProfile(app, args);

		app.run(args);
	}

	private static void setDefaultProfile(final SpringApplication app, final String[] args) {
		final SimpleCommandLinePropertySource commandLinePropertySource = new SimpleCommandLinePropertySource(args);
		if (!commandLinePropertySource.containsProperty(SPRING_PROFILES_ACTIVE_PROPERTY)) {
			app.setAdditionalProfiles(RunProfile.DEV);
		}
	}
}
