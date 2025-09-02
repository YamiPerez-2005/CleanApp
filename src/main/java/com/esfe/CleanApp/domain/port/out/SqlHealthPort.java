package com.esfe.CleanApp.domain.port.out;

public interface SqlHealthPort {
    boolean ping() throws Exception;
}
