package ace.diablo.one;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AceDiabloOne {
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(AceDiabloOne.class);
        builder.headless(false);
        builder.run(args);
    }
}
