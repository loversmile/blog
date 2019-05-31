package com.jklou.me;

//import com.jklou.controller.*;
//import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
/*import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;*/

@RunWith(SpringRunner.class)
@SpringBootTest
public class JklouApplicationTests {
    /*private MockMvc mvc;
    private MockMvc mvc2;
    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new LoginControl()).build();
        mvc2 = MockMvcBuilders.standaloneSetup(new RegisterControl()).build();
    }
    @Test
    public void getLogin() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/logintest").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public void getRegister() throws Exception {
        mvc2.perform(MockMvcRequestBuilders.get("/registertest").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }*/

    @Test
    public void contextLoads() {
    }

}
