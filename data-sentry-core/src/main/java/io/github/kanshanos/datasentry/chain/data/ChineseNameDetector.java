package io.github.kanshanos.datasentry.chain.data;

import io.github.kanshanos.datasentry.output.ContextOutput;

/**
 * 中国姓名
 *
 * @author Kanshan
 * @since 2025/4/18 15:20
 */
public class ChineseNameDetector extends AbstractSensitiveDataDetector {

    @Override
    protected boolean detect(ContextOutput output, String name, String data) {
        if (data == null) return false;
        boolean matches = data.matches("^[\\u4e00-\\u9fa5]{2,5}(·[\\u4e00-\\u9fa5]{1,4})?$");
        if (matches) {
            output.outputSensitiveItem("chinese_name", name, data);
        }
        return matches;
    }
}
