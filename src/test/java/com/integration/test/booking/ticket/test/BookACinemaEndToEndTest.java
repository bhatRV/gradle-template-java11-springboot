package com.integration.test.booking.ticket.test;

import com.rv.booking.ticket.MyApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes= MyApplication.class)
public class BookACinemaEndToEndTest {

    @Autowired
    private MockMvc mockMvc;





    void whenInValidInputMissingAge_thenReturns400_forTicketBooking() throws Exception {

        String jsonInput = "{\n" +
                "\"transactionId\": 2,\n" +
                "\"customers\": [\n" +
                "{\n" +
                "\"name\":\"Billy Kidd\",\n" +
                "\"age\": 36\n" +
                "},\n" +
                "{\n" +
                "\"name\": \"Zoe Daniels\",\n" +
                "\"age\": 3\n" +
                "},\n" +
                "{\n" +
                "\"name\":\"George White\"\n" +

                "},\n" +
                "\n" +
                "{\n" +
                "\"name\":\"Tommy Anderson\",\n" +
                "\"age\": 9\n" +
                "},\n" +
                "{\n" +
                "\"name\": \"Joe Smith\",\n" +
                "\"age\": 17\n" +
                "}\n" +
                "]\n" +
                "}";

        mockMvc.perform(post("/v1/ticket/book")
                        .contentType("application/json")
                        .content(jsonInput))
                .andExpect(status().is4xxClientError());
    }
}
