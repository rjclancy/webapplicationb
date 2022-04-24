package com.ronanclancy.webapplicationB.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class EventService {

  public String getResults(Long eventId) {
    log.info("Got results for event " + eventId);
    if (eventId == 15000 || eventId == 18000) {
      log.error("Something went wrong getting Event " + eventId);
      throw new RuntimeException("simulate load error");
    }
    return "results";
  }
}
