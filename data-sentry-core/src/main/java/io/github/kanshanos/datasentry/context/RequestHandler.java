package io.github.kanshanos.datasentry.context;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 请求信息
 *
 * @author Kanshan
 * @since 2025/4/19 20:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestHandler {

    private String method;

    private String pattern;

    public String key() {
        return method + "#" + pattern;
    }

}
