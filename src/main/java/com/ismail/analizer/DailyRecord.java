package com.ismail.analizer;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@RequiredArgsConstructor
public class DailyRecord {
    @Id
    public String id;

    @NonNull
    public String date;

    @NonNull
    public int total;
}
