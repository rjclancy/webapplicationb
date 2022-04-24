package com.ronanclancy.webapplicationB.rest;

import com.ronanclancy.webapplicationB.dto.EventResponse;
import com.ronanclancy.webapplicationB.service.EventService;
import com.ronanclancy.webapplicationB.utils.LogStackUtils;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@Log4j2
public class EventController {

  private final EventService baseService;

  @GetMapping("/event/{id}")
  ResponseEntity<EventResponse> getResults(@PathVariable final Long id) throws Exception {
    LogStackUtils.logInfo("Received events " + id);
    try {
      return new ResponseEntity<>(new EventResponse(baseService.getResults(id)), HttpStatus.OK);
    } catch (Exception e) {
      LogStackUtils.logError("error getting results for event " + id, e);
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
