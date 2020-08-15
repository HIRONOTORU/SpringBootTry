package com.example.demo0815_2;

import jp.ac.aiit.pbl.QZQSMDecoder;
import jp.ac.aiit.pbl.disaster.Disaster;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/get")
public class gtest {
    @GetMapping
    public Disaster get(@RequestParam("qzqsmdata") String qzqsm) {
        QZQSMDecoder qzqsmDecoder = new QZQSMDecoder();
        return qzqsmDecoder.decode(qzqsm);
    }
}