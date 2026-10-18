package com.zyneonstudios.apex.mojangauth.process;

import com.zyneonstudios.apex.mojangauth.process.impl.ProcessDetails;

import java.util.HashMap;

public class AuthProcess {

    @SuppressWarnings("unused")
    public HashMap<String, String> startAuthProcess(ProcessDetails process) {
        return process.login();
    }

    @SuppressWarnings("unused")
    public HashMap<String, String> reAuth(ProcessDetails process, String refreshToken) {
        return process.relogin(refreshToken);
    }

    @SuppressWarnings("unused")
    public void logout(ProcessDetails process) {
        process.logout();
    }

}
