package world.yzd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("world.yzd.dao")
public class SmartMedicineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartMedicineApplication.class, args);
    }

}
