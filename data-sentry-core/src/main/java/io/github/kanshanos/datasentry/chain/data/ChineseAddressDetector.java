package io.github.kanshanos.datasentry.chain.data;

import io.github.kanshanos.datasentry.context.SentryContextHolder;

/**
 * 中国地址
 *
 * @author Kanshan
 * @since 2025/4/18 15:20
 */
public class ChineseAddressDetector extends AbstractSensitiveDataDetector {

    @Override
    protected boolean detect(String name, String data) {
        if (data == null) return false;
        boolean matches = data.matches(".*(省|市|自治区|自治州|县|区|镇|乡|村).*");
        if (matches) {
            SentryContextHolder.addSensitiveData("chinese_address", name, data);
        }
        return matches;
    }
}
