package com.ismail.analizer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DailyRecordRepository extends MongoRepository<DailyRecord, String> {}
