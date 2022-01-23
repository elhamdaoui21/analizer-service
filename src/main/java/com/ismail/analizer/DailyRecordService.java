package com.ismail.analizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DailyRecordService {
    @Autowired
    DailyRecordRepository dailyRecordRepository;

    DailyRecord create(DailyRecordRequest request) {
        DailyRecord dailyRecord = new DailyRecord(request.date, request.total);
        return dailyRecordRepository.save(dailyRecord);
    }

    DailyRecord readById(String id) throws Exception {
        Optional<DailyRecord> dailyRecordOptional = dailyRecordRepository.findById(id);
        if (dailyRecordOptional.isEmpty()) throw new Exception("");
        return dailyRecordOptional.get();
    }

    DailyRecord updateById(String id, DailyRecordRequest request) throws Exception {
        Optional<DailyRecord> dailyRecordOptional = dailyRecordRepository.findById(id);
        if (dailyRecordOptional.isEmpty()) throw new Exception("");
        DailyRecord dailyRecord = dailyRecordOptional.get();

        dailyRecord.date = request.date;
        dailyRecord.total = request.total;

        return dailyRecordRepository.save(dailyRecord);
    }

    DailyRecord deleteById(String id) throws Exception {
        Optional<DailyRecord> dailyRecordOptional = dailyRecordRepository.findById(id);
        if (dailyRecordOptional.isEmpty()) throw new Exception("");
        DailyRecord dailyRecord = dailyRecordOptional.get();
        dailyRecordRepository.deleteById(id);
        return dailyRecord;
    }

    List<DailyRecord> readAll() {
        return dailyRecordRepository.findAll();
    }
}
