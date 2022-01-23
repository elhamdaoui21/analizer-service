package com.ismail.analizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/daily-record")
@CrossOrigin(origins = "*")
public class DailyRecordController {
    @Autowired
    DailyRecordService dailyRecordService;

    @PostMapping
    ResponseEntity<DailyRecord> create(@RequestBody DailyRecordRequest request) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(dailyRecordService.create(request));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/{id}")
    ResponseEntity<DailyRecord> readById(@PathVariable String id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(dailyRecordService.readById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping("/{id}")
    ResponseEntity<DailyRecord> updateById(@PathVariable String id, @RequestBody DailyRecordRequest request) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(dailyRecordService.updateById(id, request));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @RequestMapping(value = "/{id}", method={RequestMethod.OPTIONS,RequestMethod.DELETE})
    ResponseEntity<DailyRecord> deleteById(@PathVariable String id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(dailyRecordService.deleteById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping
    ResponseEntity<List<DailyRecord>> readAll() {
        try {
            List<DailyRecord> dailyRecords = dailyRecordService.readAll();
            return ResponseEntity.status(HttpStatus.OK)
                    .header("Access-Control-Expose-Headers", "Content-Range")
                    .header("Content-Range", "daily-record 0-100/100")
                    .body(dailyRecords);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
