package sadowski.wojciech.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import sadowski.wojciech.BasePackage;

@Configuration
@ComponentScan(basePackageClasses = BasePackage.class)
public class Config {
}
