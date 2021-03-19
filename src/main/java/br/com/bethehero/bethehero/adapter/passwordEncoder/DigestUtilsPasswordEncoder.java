package br.com.bethehero.bethehero.adapter.passwordEncoder;

import br.com.bethehero.bethehero.usecase.ong.port.PasswordEncoder;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

public class DigestUtilsPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(String str) {
        return DigestUtils.md5Digest(str.getBytes(StandardCharsets.UTF_8)).toString();
    }
}
