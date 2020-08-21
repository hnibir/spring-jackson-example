package spring.micro.services.springjacksonexample.model;

/*
 * Created by Nibir Hossain on 21.08.20
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    @Null
    private UUID id;

    @NotBlank
    private String name;

    @NotBlank
    private String style;

    @Positive
    private Long upc;

    private BigDecimal price;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
}
