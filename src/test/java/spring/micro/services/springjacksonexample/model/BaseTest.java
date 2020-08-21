package spring.micro.services.springjacksonexample.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/*
 * Created by Nibir Hossain on 21.08.20
 */
public class BaseTest {
    @Autowired
    protected ObjectMapper objectMapper;

    BeerDto getBeerDto() {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .name("Beer Name")
                .style("Radler")
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .price(new BigDecimal("12.50"))
                .upc(123456L)
                .build();
    }
}
