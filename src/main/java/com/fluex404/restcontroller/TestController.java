package com.fluex404.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/books")
    public List<ModelMap> getBooks(){
        List<ModelMap> list = new ArrayList<>();

        jdbcTemplate.query("SELECT * FROM book", rs -> {
            ModelMap m = new ModelMap();

            m.put("id", rs.getLong(1));
            m.put("name", rs.getString(3));
            m.put("date", rs.getDate(4));

            list.add(m);
        });

        return list;
    }
}
