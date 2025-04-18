package io.github.kanshanos.datasentry.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Collections;
import java.util.List;


/**
 * 配置属性
 *
 * @author Kanshan
 * @since 2025/4/18 10:51
 */
@Data
@ConfigurationProperties(prefix = DataSentryProperties.PREFIX)
public class DataSentryProperties {
    public static final String PREFIX = "kanshanos.datasentry";

    private boolean enabled = true;


    /**
     * 采样率
     */
    private double samplingRate = 0.5;

    /**
     * 排除路径
     */
    private List<String> excludePathPatterns = Collections.emptyList();

    /**
     * 时间窗口命中间隔时间，单位秒
     */
    private long timeWindowHitIntervalSeconds = 60;

    /**
     * 敏感数据命中间隔时间，单位秒
     */
    private long sensitiveHitIntervalSeconds = 60;

}
