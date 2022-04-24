package com.ronanclancy.webapplicationB.service;

import com.ronanclancy.webapplicationB.utils.LogStackUtils;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class EventService {

  public String getResults(Long eventId) {
    LogStackUtils.logInfo("Got results for event " + eventId);
    if (eventId == 15000 || eventId == 18000) {
      throw new RuntimeException("Something went wrong getting Event " + eventId);
    }
    return "results";
  }
}
