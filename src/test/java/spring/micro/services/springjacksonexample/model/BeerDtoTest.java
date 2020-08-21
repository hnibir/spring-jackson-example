package spring.micro.services.springjacksonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {
        // String json = "{\"id\":\"2752c935-f532-4011-9558-d47f0b784a3b\",\"name\":\"Beer Name\",\"style\":\"Radler\",\"upc\":123456," +
        //        "\"price\":12.50,\"createdDate\":\"2020-08-21T12:55:40.425029+02:00\",\"lastModifiedDate\":\"2020-08-21T12:55:40.427165+02:00\"}";

        String json = "{\"beerId\":\"2752c935-f532-4011-9558-d47f0b784a3b\",\"name\":\"Beer Name\",\"style\":\"Radler\",\"upc\":123456," +
                "\"price\":12.50,\"createdDate\":\"2020-08-21T12:55:40.425029+02:00\",\"lastModifiedDate\":\"2020-08-21T12:55:40.427165+02:00\"}";

        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(beerDto);
    }
}