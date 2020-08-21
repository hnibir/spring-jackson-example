package spring.micro.services.springjacksonexample.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/*
 * Created by Nibir Hossain on 21.08.20
 */
public class BaseTest {
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
