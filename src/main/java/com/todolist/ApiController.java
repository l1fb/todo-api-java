package com.todolist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {
    @GetMapping("/get")
    public Iterable<String> getList() {
        List<String> list = new ArrayList<String>();
        list.add("something");
        list.add("add");

        return list;
    }
}
