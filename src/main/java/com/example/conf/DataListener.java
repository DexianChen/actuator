package com.example.conf;

import com.example.constant.MonitorIndex;
import io.micrometer.core.instrument.Metrics;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import static com.example.constant.MonitorIndex.TEST;

@Service
public class DataListener implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Metrics.counter(TEST, MonitorIndex.Labels.KEY, "1").increment();
    }
}
