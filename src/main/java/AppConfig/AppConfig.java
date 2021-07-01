package AppConfig;

import calcset.ArgumentResolver;
import calcset.Calculator;
import calcset.ScannerArgumentResolver;
import calcset.addCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Calculator calculator() {
        return new addCalculator();
    }

    @Bean
    ArgumentResolver argumentResolver(){
        return new ScannerArgumentResolver();
    }
}
