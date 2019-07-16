package com.tw.apistackbase.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void should_return_expected_employees_when_call_get_employees() throws Exception {
        mockMvc.perform(get("/employees"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json("[\n" +
                        "    {\n" +
                        "        \"id\": 4,\n" +
                        "        \"name\": \"alibaba1\",\n" +
                        "        \"age\": 20,\n" +
                        "        \"gender\": \"male\",\n" +
                        "        \"salary\": 6000\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"id\": 11,\n" +
                        "        \"name\": \"tengxun2\",\n" +
                        "        \"age\": 19,\n" +
                        "        \"gender\": \"female\",\n" +
                        "        \"salary\": 7000\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"id\": 6,\n" +
                        "        \"name\": \"alibaba3\",\n" +
                        "        \"age\": 19,\n" +
                        "        \"gender\": \"male\",\n" +
                        "        \"salary\": 8000\n" +
                        "    }\n" +
                        "]"));
    }

    @Test
    public void should_return_expected_employee_when_call_get_specific_employee() throws Exception {
        mockMvc.perform(get("/employees/4"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json("{\n" +
                        "    \"id\": 4,\n" +
                        "    \"name\": \"alibaba1\",\n" +
                        "    \"age\": 20,\n" +
                        "    \"gender\": \"male\",\n" +
                        "    \"salary\": 6000\n" +
                        "}"));
    }
}