package spring.micro.services.springjacksonexample.model;

/*
 * Created by Nibir Hossain on 21.08.20
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
@JsonTest
public class BeerDtoSankeTest extends BaseTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testSnakeCase() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }
}
