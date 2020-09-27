package com.study.consumer.controller;

import com.study.consumer.service.ConsumerService;
import com.study.provider.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author Lance
 * @since  2020-09-27
 */
@RestController
@RequestMapping("/user")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/list")
    public List<User> list(){

        return consumerService.list();
    }
}
