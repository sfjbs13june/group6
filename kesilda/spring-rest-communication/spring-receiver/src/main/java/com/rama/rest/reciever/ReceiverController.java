package com.rama.rest.reciever;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiverController {
  private static final Logger LOGGER = LoggerFactory.getLogger(ReceiverController.class);

  @GetMapping("/receiver/get")
  public String getDetail() throws InterruptedException {
    LOGGER.info("Receiver request:");
//    Thread.sleep(5000);
    return "Data from receiver";
  }
  @GetMapping("/receiver/hello")
  public String getDetailHello() throws InterruptedException {
    LOGGER.info("Receiver request: Hello");
//    Thread.sleep(5000);
    return "Data from receiver Hello";
  }
}
