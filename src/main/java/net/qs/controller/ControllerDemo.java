package net.qs.controller;

import net.qs.service.ServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * NAME: ControllerDemo
 * USER: LSQ
 * DATE: 2020/5/7
 * TIME: 18:18
 **/
@Controller
public class ControllerDemo {

    @Autowired
    ServiceDemo serviceDemo;


}
