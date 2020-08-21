package spring.micro.services.springjacksonexample.model;

/*
 * Created by Nibir Hossain on 21.08.20
 */

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring.micro.services.springjacksonexample.serializer.LocalDateSerializer;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    @JsonProperty("beerId")
    @Null
    private UUID id;

    @NotBlank
    private String name;

    @NotBlank
    private String style;

    @Positive
    private Long upc;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal price;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
    private OffsetDateTime createdDate;

    private OffsetDateTime lastModifiedDate;

    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate myLocalDate;
}
