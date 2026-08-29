package com.src.organizer.scheduleItem;

import com.src.organizer.scheduleItem.model.ScheduleItemResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/schedule_items", produces = "application/json")
public class ScheduleItemController {

    private final ScheduleItemService scheduleItemService;

    @GetMapping
    public List<ScheduleItemResponse> getAllScheduleItems() {
        return scheduleItemService.getAllScheduleItems();
    }

    @GetMapping("/{id}")
    public ScheduleItemResponse getScheduleItemById(@PathVariable Long id) {
        return scheduleItemService.getScheduleItemById(id);
    }
}
